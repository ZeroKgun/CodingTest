import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        int answer = 1;
        int total = 1;
        int mul = 1;
        while(total < num){
            total += 6 *mul;
            answer++;
            mul++;
        }
        System.out.println(answer);

    }
}