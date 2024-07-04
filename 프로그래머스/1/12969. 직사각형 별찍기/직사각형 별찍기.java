import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<y; i++){
            for(int j=0;j<x;j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}