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
        HashSet<String> setHear = new HashSet<>();
        HashSet<String> setSee = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            String name = br.readLine();
            setHear.add(name);
        }
        for(int i=0;i<m;i++){
            String name = br.readLine();
            setSee.add(name);
        }

        for(String name : setHear){
            if(setSee.contains(name)){
                result.add(name);
            }
        }

        Collections.sort(result);
        bw.write(result.size() + "\n");
        for(String name : result){
            bw.write(name + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}