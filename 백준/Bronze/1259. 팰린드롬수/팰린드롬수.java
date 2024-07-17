import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb;
        
        while(true){
            sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            
            if(str.equals("0")) break;
            
            String reverse = sb.append(str).reverse().toString();
            
            if(str.equals(reverse)) bw.write("yes\n");
            else bw.write("no\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}