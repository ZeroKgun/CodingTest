import java.util.*;
import java.io.*;

public class Main {


    public static boolean[] visited;
    public static void backtrack(List<Integer> nums, int n, int size, BufferedWriter bw) throws IOException {
        if (nums.size() == size) {
            for (Integer num : nums) {
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(visited[i]) continue;

            visited[i] = true;
            nums.add(i);
            backtrack(nums, n, size, bw);
            nums.remove(nums.size() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        visited = new boolean[x+1];
        backtrack(new ArrayList<>(),  x, y, bw);

        br.close();
        bw.flush();
        bw.close();
    }
}