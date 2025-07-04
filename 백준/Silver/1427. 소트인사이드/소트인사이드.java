import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            arr[i] = Integer.parseInt(str.substring(i,i+1));
        }

        //선택정렬
        for(int i=0; i<str.length();i++){
            int Max = i;
            for(int j = i+1; j<str.length(); j++){
                if(arr[j]>arr[Max]){
                    Max = j;
                }
            }
            if(arr[i]<arr[Max]){
                int temp = arr[i];
                arr[i] = arr[Max];
                arr[Max] = temp;
            }
        }
        for(int i=0; i<str.length();i++){
            System.out.print(arr[i]);
        }

        
    }

}