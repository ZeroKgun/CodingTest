import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] map;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            dp = new int[N][M];
            int[][] tmp = new int[2][M];

            // tmp[0] -> 왼쪽 >>
            // tmp[1] -> 오른쪽 <<
            for (int i = 0; i < N; ++i) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; ++j) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][0] = map[0][0];

            for (int i = 1; i < M; i++) {
                dp[0][i] = map[0][i] + dp[0][i - 1];
            }

            for (int i = 1; i < N; i++) {

                tmp[0][0] = map[i][0] + dp[i - 1][0];

                for (int j = 1; j < M; j++) {
                    tmp[0][j] = Math.max(tmp[0][j - 1], dp[i - 1][j]) + map[i][j];
                }

                tmp[1][M - 1] = map[i][M - 1] + dp[i - 1][M - 1];

                for (int k = M - 2; k >= 0; k--) {
                    tmp[1][k] = Math.max(tmp[1][k + 1], dp[i - 1][k]) + map[i][k];
                }

                for (int l = 0; l < M; l++) {
                    dp[i][l] = Math.max(tmp[0][l], tmp[1][l]);
                }

            }
            System.out.println(dp[N - 1][M - 1]);

            br.close();
            bw.close();
        }
    }
}