import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a == 0){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else stack.push(a);
        }
        int total = 0;
        while(!stack.isEmpty()){
            total += stack.pop();
        }
        bw.write(String.valueOf(total));
        
        br.close();
        bw.flush();
        bw.close();
    }
}