import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int max = Integer.MIN_VALUE;
        int idx = -1;

        for(int i = 0;i<9; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if(num > max){
                max = num;
                idx = i+1;
            }
        }

        bw.write(max +"\n");
        bw.write(idx +"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}