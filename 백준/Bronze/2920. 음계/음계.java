import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] asc = {1,2,3,4,5,6,7,8};
        int[] desc = {8,7,6,5,4,3,2,1};

        int[] code = new int[8];

        for(int i=0; i<8;i++){
            code[i] = Integer.parseInt(st.nextToken());
        }

        if(Arrays.equals(asc,code)){
            bw.write("ascending");
        }
        else if(Arrays.equals(desc,code)){
            bw.write("descending");
        }
        else{
            bw.write("mixed");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}