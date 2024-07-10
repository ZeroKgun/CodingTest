import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String origin = st.nextToken();
        StringBuilder sb = new StringBuilder();
        String tmp = sb.append(origin).reverse().toString();

        if(origin.equals(tmp)) bw.write("1");
        else bw.write("0");
        
        bw.close();
        br.close();
    }
}