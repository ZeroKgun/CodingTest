import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        for(int i = 1; i<N+1; i++){
            arr[i] = i;
        }

        int start = 1;
        int end = 1;
        int sum = arr[1];
        int count = 1;

        while(end != N){
            if(sum == N){
                count++;
                end++;
                sum = sum + arr[end];
            }
            else if(sum > N){
                sum = sum - arr[start];
                start++;
            }
            else if(sum < N){
                end++;
                sum = sum + arr[end];
            }
        }
        System.out.println(count);
    }

}