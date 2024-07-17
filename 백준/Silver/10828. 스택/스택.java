import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Deque<Integer> stack = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String op = st.nextToken();
            switch(op) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case "top":
                    if(stack.isEmpty()) {
                        bw.write(-1 +"\n");
                    }
                    else{
                        bw.write(stack.peek() + "\n");
                    }
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        bw.write(-1 +"\n");
                    }
                    else{
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        bw.write(1 +"\n");
                    }
                    else{
                        bw.write("0" + "\n");
                    }
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}