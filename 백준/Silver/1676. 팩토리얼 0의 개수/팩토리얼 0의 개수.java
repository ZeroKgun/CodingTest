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
        
        int two = 0;
        int five = 0;

        for(int i=1; i<=N; i++){
            int tmp = i;
            if(tmp % 2 == 0){
                while(tmp % 2 == 0){
                    tmp = tmp / 2;
                    two++;
                }
            }
            if(tmp % 5 == 0){
                while(tmp % 5 == 0){
                    tmp = tmp / 5;
                    five++;
                }
            }
        }

        int result = Math.min(two,five);
        System.out.println(result);

        input.close();

        
    }
}