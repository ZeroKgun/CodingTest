import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());


        double[] score = new double[n];
        double max = -1;
        double total = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            double num = Integer.parseInt(st.nextToken());
            score[i] = num;
            max = Math.max(max, num);
        }

        for(int i = 0; i < n; i++) {
            score[i] = (score[i] / max) * (double)100;
            total += score[i];
        }

        double avg = total/n;
        bw.write(avg+"\n");
        br.close();
        bw.close();
    }
}