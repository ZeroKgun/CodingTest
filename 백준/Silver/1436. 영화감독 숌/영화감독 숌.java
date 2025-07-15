import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int cnt = 1;
        int start = 666;
        while(cnt<N){
            start++;
            String tmp = String.valueOf(start);
            if(tmp.contains("666")) cnt++;
        }

        System.out.println(start);
        input.close();

        
    }
}