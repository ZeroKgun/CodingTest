import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=num){
                while(arr[i]>=num){
                    stack.push(num);
                    num++;
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else{
                int n = stack.pop();
                if(n > arr[i]){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else{
                    sb.append("-\n");
                }
            }
        }
        if(result) System.out.println(sb.toString());

    }

}