import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int white = 0;
    static int blue = 0;
    static int[][] paper;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> trees = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            trees.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(trees, Collections.reverseOrder());

        int start = 0;
        int end = trees.get(0);
        int result=0;

        while(start <= end){
            int mid = (start + end)/2;
            long total = 0;
            for(int tree : trees){
                if( tree > mid){
                    total += (tree-mid);
                }
            }

            if(total >= M){
                result = mid;
                start = mid+1;
            }
            else{
                end = mid - 1;
            } 
        }

        // 정답 출력

        bw.write(result+"\n");
        bw.close();
        br.close();
    }

}
