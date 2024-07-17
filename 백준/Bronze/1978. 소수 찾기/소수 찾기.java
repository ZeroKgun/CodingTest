import java.util.*;
import java.io.*;

public class Main {

    public static boolean isPrime(int num){

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int answer = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a==1) continue;
            if(isPrime(a)) answer++;
        }

        bw.write(answer + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}