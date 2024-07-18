import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());
        if(year % 4 ==0 && (year % 100 !=0 || year % 400 == 0)) bw.write(1+"\n");
        else bw.write(0+"\n");
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}