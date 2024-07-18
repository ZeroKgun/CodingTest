import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] sizeArr = new int[6];

        for(int i = 0; i < 6; i++){
            sizeArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int tshirt = 0;
        for(int num : sizeArr){
            tshirt += num/t;
            if(num%t > 0) tshirt += 1;
        }
        int penB = n/p;
        int penL = n%p;
        bw.write(tshirt + "\n");
        bw.write(penB + " " + penL + "\n");
        bw.close();
        br.close();
    }
}