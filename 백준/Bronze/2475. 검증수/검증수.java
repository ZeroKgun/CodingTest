import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = 0;
        for(int i=0; i<5; i++){
            int tmp = Integer.parseInt(st.nextToken());
            total += (int) Math.pow(tmp,2);
        }
        int gum = total % 10;
        bw.write(String.valueOf(gum));
        br.close();
        bw.flush();
        bw.close();
    }
}