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

        int N = Integer.parseInt(br.readLine());

        paper = new int[N][N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<N; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cutPaper(0,0,N);

        bw.write(white+"\n"+blue+"\n");
        // 정답 출력

        bw.flush();
        bw.close();
        br.close();
    }

    public static void cutPaper(int x, int y, int size){

        if(size == 1){
            if(paper[x][y] == 1) blue++;
            else white++;
        }
        else if(isOk(x,y,size) == 1){
            blue++;
            return;
        }
        else if(isOk(x,y,size) == 0){
            white++;
            return;
        }
        else{
            cutPaper(x, y,size/2);
            cutPaper(x, y+size/2, size/2);
            cutPaper(x+size/2, y, size/2);
            cutPaper(x+size/2, y+size/2, size/2);
        }

    }


    public static int isOk(int x, int y, int size){

        int first = paper[x][y];
        boolean check = true;
        for(int i=x; i<x+size; i++){
            for(int j=y; j<y+size; j++){
                if(first != paper[i][j]){
                    check = false;
                    break;
                }
            }
            if(!check) return -1;
        }

        return first;
    }

}
