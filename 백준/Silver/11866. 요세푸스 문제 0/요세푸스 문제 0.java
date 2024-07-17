import java.util.*;
import java.io.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i =1; i<=n; i++){
            list.add(i);
        }
        int idx = 0;
        while(!list.isEmpty()){
            int len = list.size();

            idx = (idx + k-1) % len;
            int erase = list.remove(idx);
            result.add(erase);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 0; i<result.size(); i++){
            sb.append(result.get(i));
            if(i!=result.size()-1){
                sb.append(", ");
            }
            else sb.append(">");
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}