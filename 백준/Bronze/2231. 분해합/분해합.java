import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        int answer = 0;
        for(int i = 1; i<=num ; i++){
            int total = 0;
            total += i;
            int tmp = i;
            while(tmp>0){
                total += tmp%10;
                tmp = tmp/10;
            }
            if(total == num){
                answer = i;
                break;
            }
        }

        System.out.println(answer);




    }
}