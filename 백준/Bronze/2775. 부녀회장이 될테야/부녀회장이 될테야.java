import java.util.*;
import java.io.*;

public class Main {

    static int[][] cnt;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        cnt = new int[15][15];

        for(int i = 1; i < 15; i++){
            cnt[0][i] = i;
        }

        int T = Integer.parseInt(st.nextToken());

        for(int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(ppl(k,n));
        }
    }

    public static int ppl(int k, int n) {

        if (cnt[k][n] > 0) return cnt[k][n];
        else {
            for (int i = 1; i <= n; i++) {
                cnt[k][n] += ppl(k - 1, i);
            }
            return cnt[k][n];
        }
    }
}