import java.util.*;
import java.io.*;

public class Main {


    static int N;
    static int R;
    static int C;
    static int answer = 0;
    
    public static void find(int r, int c, int size){
        if(size == 1){
            System.out.println(answer);
            return;
        }
        int newSize = size/2;

        //1사분면
        if(R < r + newSize && C < c + newSize ){
            find(r,c, newSize);
        }

        //2사분면
        else if(R < r + newSize && C >= c + newSize){
            answer += (size * size) /4;
            find(r,c+newSize , newSize);
        }

        //3사분면
        else if(R >= r + newSize && C < c+newSize){
            answer += (size*size) / 4 * 2;
            find(r+newSize,c , newSize);
        }
        //4사분면
        else if(R>= r + newSize && C >= c + newSize){
            answer += (size * size) / 4 * 3;
            find(r+newSize,c+newSize, newSize);
        }
    }

    //size = 8

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        int size = (int)(Math.pow(2,N));

        find(0,0, size);


        bw.close();
        br.close();
        return;
    }
}

// N r c
// 2 3 1   11
// 3 7 7   63
