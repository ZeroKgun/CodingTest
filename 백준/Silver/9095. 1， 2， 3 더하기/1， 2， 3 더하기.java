import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] cnt = new int[12];
        cnt[0] = 1;
        cnt[1] = 1;
        cnt[2] = 2;

        for(int i=3; i<=11; i++){
            cnt[i] = cnt[i-1] + cnt[i-2] + cnt[i-3];
        }

        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            int target = Integer.parseInt(br.readLine());
            bw.write(cnt[target] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}