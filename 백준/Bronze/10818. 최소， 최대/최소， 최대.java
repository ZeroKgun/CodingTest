import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for(int i = 0;i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            max = Math.max(max,num);
            min = Math.min(min,num);
        }

        bw.write(min + " " + max + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}