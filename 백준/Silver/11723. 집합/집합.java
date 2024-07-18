import java.util.*;
import java.io.*;

public class Main {

    public static boolean isPrime(int num){

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();

            switch(op){
                case "add":
                    int numA = Integer.parseInt(st.nextToken());
                    if(!set.contains(numA)) set.add(numA);
                    break;
                case "remove":
                    int numD = Integer.parseInt(st.nextToken());
                    if(set.contains(numD)) set.remove(numD);
                    break;
                case "check":
                    int numC = Integer.parseInt(st.nextToken());
                    if(set.contains(numC)) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "toggle":
                    int numT = Integer.parseInt(st.nextToken());
                    if(set.contains(numT)) set.remove(numT);
                    else set.add(numT);
                    break;
                case "all":
                    set = new HashSet<>();
                    for(int j=1;j<=20;j++){
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}