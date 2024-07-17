import java.util.*;
import java.io.*;


public class Main {


    public static int factorial(int n) {
        int answer = 1;
        for(int i = 2; i <= n; i++) {
            answer *= i;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int nF = factorial(n);
        int nMk = factorial(n-k);
        int kF = factorial(k);
        
        int answer = nF / (nMk * kF);
        
        bw.write(answer + "\n");
        
        br.close();
        bw.close();
    }
}