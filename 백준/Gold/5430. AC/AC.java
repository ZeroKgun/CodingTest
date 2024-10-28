import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int N, M;
    static int[][] map;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());

        while (T > 0) {
            String command = br.readLine();
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            ArrayDeque<Integer> deque = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }
            String result = AC(command, deque);
            bw.write(result+"\n");
            T = T - 1;
        }

        br.close();
        bw.close();
    }

    public static String AC(String command, ArrayDeque<Integer> deque) {

        StringBuilder sb = new StringBuilder();
        boolean reverse = false;

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'R') {
                reverse = !reverse;
            }

            else if (command.charAt(i) == 'D') {

                if (reverse) {
                    if (deque.pollLast() == null) {
                        return "error";
                    }
                } else if (!reverse) {
                    if (deque.pollFirst() == null) {
                        return "error";
                    }
                }
            }
        }
        sb.append('[');
        if (deque.size() > 0) {
            
            if (reverse) {
                sb.append(deque.pollLast());
                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollLast());
                }
            } else {
                sb.append(deque.pollFirst());

                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollFirst());
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
