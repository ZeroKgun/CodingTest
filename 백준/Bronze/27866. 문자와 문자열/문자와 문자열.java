import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        
        char c = str.charAt(n-1);
        bw.write(c);
        
        br.close();
        bw.flush();
        bw.close();
    }
}