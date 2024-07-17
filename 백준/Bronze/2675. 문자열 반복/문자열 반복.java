import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j = 0; j<str.length(); j++) {
                for(int k =0; k<a; k++){
                    sb.append(str.charAt(j));
                }
            }
            bw.write(sb.toString() +"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}