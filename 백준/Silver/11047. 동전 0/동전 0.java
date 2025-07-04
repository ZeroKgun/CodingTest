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
        int K = sc.nextInt();

        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        int idx = N-1;
        while(K>0){
            if(arr[idx]<=K){
                cnt = cnt + (K/arr[idx]);
                K = K % arr[idx];
            }
            idx--;
        }
        System.out.println(cnt);
        
    }

}