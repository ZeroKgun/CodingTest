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

        int A = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[A];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<A; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        list.add(arr[0]);

        for(int i=1; i<A; i++){
            if(list.get(list.size()-1) < arr[i])
                list.add(arr[i]);
            else{
                int left = 0;
                int right = list.size()-1;

                while(left<=right){
                    int mid = (left + right)/2;
                    if(list.get(mid) < arr[i])
                        left = mid + 1;
                    else
                        right = mid -1;
                }
                list.set(left, arr[i]);
            }
        }
        System.out.println(list.size());

    }
}