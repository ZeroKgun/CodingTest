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

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        int[] weight=  new int[N];
        int[] height = new int[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            int w = weight[i];
            int h = height[i];

            for(int j = 0; j<N; j++){
                if(i!=j){
                    if(w<weight[j] && h<height[j]){
                        arr[i] = arr[i] + 1;
                    }
                }
            }
        }

        for(int i=0; i<N; i++){
            System.out.print((arr[i]+1) + " ");
        }
        

        
    }
}