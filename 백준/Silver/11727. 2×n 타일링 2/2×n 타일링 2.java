import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int[] memo;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        
        if (n == 1) {
            bw.write("1\n");
            bw.flush();
            bw.close();
            return;
        } else if (n == 2) {
            bw.write("3\n");
            bw.flush();
            bw.close();
            return;
        }

        
        memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 3;

        
        int answer = dp(n);

        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int dp(int n) {

        
        if (memo[n] > 0) {
            return memo[n];
        }

        // 새로 계산한 값을 메모 배열에 저장
        //2*2 타일 가짓수는 2*1 타일 가짓수랑 동일
        memo[n] = (dp(n - 1) + 2*dp(n - 2)) % 10007;

        
        return memo[n];
    }
}
