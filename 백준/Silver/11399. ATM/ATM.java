import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }

        Collections.sort(list);
        int total = 0;
        int tmp =0;
        for(int num : list){
            tmp += num;
            total += tmp;
        }

        bw.write(total + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}