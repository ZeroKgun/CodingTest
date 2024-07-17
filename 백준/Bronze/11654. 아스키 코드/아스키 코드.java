import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();

        int n = str.charAt(0);
        
        bw.write(String.valueOf(n));

        br.close();
        bw.flush();
        bw.close();
    }
}