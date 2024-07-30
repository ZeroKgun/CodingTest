import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        int hash = 0;

        for(int i = 0; i < num; i++){
            int tmp = (int) Math.pow(31,i);
            int ch = str.charAt(i) - 'a' + 1;
            
            hash += ch * tmp;
        }

        System.out.println(hash);
    }
}