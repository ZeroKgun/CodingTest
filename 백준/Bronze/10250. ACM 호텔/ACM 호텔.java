import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        

        int a = Integer.parseInt(st.nextToken());

        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int y = 0;
            int x = 0;
            
            if(n<=h){
                y = n;
                x = 1;
            }
            else{
                
                y = n % h;
                x = n/h + 1;
                if(n%h==0){
                    y = h;
                    x = n/h;
                }
            }
            String tmp = String.valueOf(y);
            
            if(x<10){
                tmp += "0" + x;
            }
            else{
                tmp += x;
            }
            bw.write(tmp + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}