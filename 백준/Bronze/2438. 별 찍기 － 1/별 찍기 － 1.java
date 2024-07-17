import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

       for(int i=1; i<=n; i++) {
           for(int j=0; j<i; j++) {
               bw.write("*");
           }
           bw.newLine();
       }
        br.close();
        bw.flush();
        bw.close();
    }
}