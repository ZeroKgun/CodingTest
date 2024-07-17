import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<String> list = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            if(!list.contains(str)){
                list.add(str);
            }
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()) return -1;
                else if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else
                    return 1;
            }
        });
        for(String s : list){
            bw.write(s+"\n");
        }

        br.close();
        bw.close();
    }
}