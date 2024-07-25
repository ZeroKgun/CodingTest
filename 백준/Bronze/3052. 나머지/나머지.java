import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<10;i++){
            int a = Integer.parseInt(br.readLine());
            set.add(a%42);
        }

        bw.write(set.size() + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}