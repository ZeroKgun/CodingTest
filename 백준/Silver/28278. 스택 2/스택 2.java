import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            switch (op){
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case 2:
                    if(!stack.isEmpty()){
                        bw.write(String.valueOf(stack.pop()));
                    }
                    else{
                        bw.write("-1");
                    }
                    bw.newLine();
                    break;
                case 3:
                    bw.write(String.valueOf(stack.size()));
                    bw.newLine();
                    break;
                case 4:
                    if(stack.isEmpty())
                        bw.write("1");
                    else
                        bw.write("0");
                    bw.newLine();
                    break;
                case 5:
                    if(!stack.isEmpty()){
                        bw.write(String.valueOf(stack.peek()));
                    }
                    else
                        bw.write("-1");
                    bw.newLine();
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}