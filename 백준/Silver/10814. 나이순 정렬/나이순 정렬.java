import java.util.*;
import java.io.*;

public class Main {

    public static class Member {
        String name;
        int age;
        int order;

        public Member(String name, int age, int order) {
            this.name = name;
            this.age = age;
            this.order = order;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Member> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Member(name, age, i));
        }

        Collections.sort(list, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if (o1.age != o2.age) {
                    return o1.age - o2.age;
                } else {
                    return o1.order - o2.order;
                }
            }
        });

        for (Member member : list) {
            bw.write(member.age + " " + member.name + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}