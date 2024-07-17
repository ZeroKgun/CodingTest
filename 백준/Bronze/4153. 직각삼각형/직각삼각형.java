import java.util.*;
import java.io.*;

public class Main {
    
    public static boolean vertical(int a, int b, int c){
        int max = Math.max(a,Math.max(b,c));
        
        if(max == c){
            return a * a + b * b == c * c;
        }
        else if (max == b){
            return c * c + a * a == b * b;
        }
        else{
            return c * c + b * b == a * a;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb;
        
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0) break;
            
            if(vertical(a,b,c)) bw.write("right\n");
            else bw.write("wrong\n");
        }
        

        br.close();
        bw.flush();
        bw.close();
    }
}