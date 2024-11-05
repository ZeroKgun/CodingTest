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
    static int answer = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        String T = br.readLine();

        change(S,T);

        // 정답 출력
        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

    public static void change(String s, String t){

        if(s.length() == t.length()){
            if(s.equals(t)){
                answer = 1;
                return;
            }
            return;
            // else{
            //     System.out.println("0\n");
            //     return;
            // }
        }

        if(t.charAt(t.length()-1) == 'A'){
            StringBuilder sb = new StringBuilder();
            sb.append(t.substring(0, t.length()-1));
            change(s,sb.toString());
        }

        if(t.charAt(0) == 'B'){
            StringBuilder sb = new StringBuilder();
            sb.append(t.substring(1));
            change(s,sb.reverse().toString());
        }
    }
    //t -> s 로 변경
    //1. 문자열 뒤의 A를 뺌
    //2. 첫번째 B 빼고 문자열 뒤집기
}
