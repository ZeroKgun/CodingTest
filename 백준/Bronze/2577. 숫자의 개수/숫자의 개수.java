import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] count = new int[10];
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        String total = String.valueOf(a*b*c);
        
        for(int i = 0; i < total.length(); i++){
            count[total.charAt(i)-'0']++;
        }
        
        

        for(int cnt : count){
            bw.write(cnt + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}