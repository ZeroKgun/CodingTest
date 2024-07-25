import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            int score = 0;
            String str = br.readLine();

            int tmp = 1;
            for(int j=0; j<str.length();j++){
                if(str.charAt(j) == 'O'){
                    score += tmp;
                    tmp++;
                }
                else if(str.charAt(j)=='X'){
                    tmp = 1;
                }
            }
            bw.write(score+"\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }
}