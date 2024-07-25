import java.util.*;
import java.io.*;

public class Main {

    static int[][] cnt;;

    public static int[] fibonacci(int n){
        if(cnt[n][0] == -1 || cnt[n][1] == -1){
            cnt[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
            cnt[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
        }
        return cnt[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        cnt = new int[41][2];
        for (int[] ints : cnt) {
            Arrays.fill(ints, -1);
        }
        cnt[0][0] = 1;
        cnt[0][1] = 0;
        cnt[1][0] = 0;
        cnt[1][1] = 1;
        
        for(int i=0; i<n; i++){
            int t = Integer.parseInt(br.readLine());
            int[] result = fibonacci(t);
            bw.write(cnt[t][0] + " " + cnt[t][1] +"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}