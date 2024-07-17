import java.util.*;
import java.io.*;


public class Main {


    public static class Position{
        int x;
        int y;
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Position> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            Position pos = new Position(x, y);
            list.add(pos);
        }

        Collections.sort(list, new Comparator<Position>() {
            @Override
            public int compare(Position o1, Position o2) {
                if(o1.x != o2.x){
                    return o1.x - o2.x;
                }
                else{
                    return o1.y - o2.y;
                }
            }
        });
        
        for(Position pos : list){
            bw.write(pos.x + " " + pos.y + "\n");
        }

        br.close();
        bw.close();
    }
}