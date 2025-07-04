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

        int T = Integer.parseInt(st.nextToken());

        for(int i = 0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];

            ArrayList<Integer> list = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            list.add(arr[0]);

            for(int k=1; k<arr.length; k++){
                if(list.get(list.size()-1) < arr[k]){
                    list.add(arr[k]);
                }
                else{
                    int left = 0;
                    int right = list.size()-1;
                    while(left<=right){
                        int mid = (left + right)/2;
                        if(list.get(mid)<arr[k]){
                            left = mid + 1;
                        }
                        else 
                            right = mid -1;
                    }
                    list.set(left,arr[k]);
                }
            }
            System.out.println("Case #" + (i+1));
            if(list.size() >= K){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}