import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};



        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        for(int i=0; i<arr.length; i++){
            int idx = str.indexOf(arr[i]);
            sb.append(idx).append(" ");
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}