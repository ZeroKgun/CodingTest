import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        String str = br.readLine();
        str = str.trim();
        String[] arr = str.split(" ");

        for(String str1 : arr){
            if(str1.length() != 0) cnt++;
        }


        bw.write(cnt+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
}