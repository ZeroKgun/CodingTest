import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m < 45){
            h = h -1;
            m = 60 - (45-m);
            if(h<0){
                h = 23;
            }
        }
        else{
            m = m - 45;
        }
        bw.write(h + " " + m + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}