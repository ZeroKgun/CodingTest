import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String full = br.readLine();

        char[] arr = full.toCharArray();

        int check = Character.getNumericValue(arr[arr.length-1]);
        int sum = 0;
        int answer = 0;
        int mul = 1;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != '*'){
                int tmp = Character.getNumericValue(arr[i]);
                if(i%2==0) sum = sum + tmp;
                else sum = sum + 3*tmp;
            }
            else{
                if(i%2 != 0) mul = 3;
            }
        }

        

        for(int i=0; i<=9; i++){
            if ((sum + i * mul + check) % 10 == 0){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}