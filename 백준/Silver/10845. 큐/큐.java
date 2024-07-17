import java.util.*;
import java.io.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> que = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            switch(op){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    que.add(num);
                    break;
                case "pop":
                    if(que.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(que.remove()+"\n");
                    }
                    break;
                case "size":
                    bw.write(que.size()+"\n");
                    break;

                case "empty":
                    if(que.isEmpty()){
                        bw.write("1\n");}
                    else
                        bw.write("0\n");
                    break;
                case "front":
                    if(que.isEmpty()){
                        bw.write("-1\n");
                    }
                    else
                        bw.write(que.peekFirst()+"\n");
                    break;
                case "back":
                    if(que.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(que.peekLast()+"\n");
                    }
                    break;
            }
        }
        br.close();
        bw.close();
    }
}