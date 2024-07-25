import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<=n; i++) {
            for(int j=0; j<n-i; j++){
                sb.append(' ');
            }
            for(int k=0; k<i; k++){
                sb.append('*');
            }
            sb.append('\n');
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}