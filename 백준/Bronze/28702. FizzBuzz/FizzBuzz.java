
import java.io.*;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = new String[3];

        for(int i = 0; i < 3; i++) {
            arr[i] = br.readLine();
        }
        int nextnum = 0;
        for(int i=0;i<3;i++) {
            if(!arr[i].equals("Fizz") && !arr[i].equals("Buzz") && !arr[i].equals("FizzBuzz")) {
                nextnum = Integer.parseInt(arr[i]) + (3-i);
                break;
            }
        }
        if(nextnum % 3 == 0 && nextnum % 5 == 0) {
            bw.write("FizzBuzz\n");
        }
        else if(nextnum % 3 == 0) {
            bw.write("Fizz\n");
        }
        else if(nextnum % 5 == 0) {
            bw.write("Buzz\n");
        }
        else{
            bw.write(nextnum + "\n");
        }

        bw.flush();
        bw.close();

    }
}