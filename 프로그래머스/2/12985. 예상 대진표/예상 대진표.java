import java.util.*;


class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(a!=b){
            if(a%2==0) a = a/2;
            else a = (a+1)/2;
            
            if(b%2 == 0) b = b/2;
            else b = (b+1)/2;
            
            answer++;
        }
        // if(a>b && (b%2==0 && a%2!=0)) answer++;
        // else if (b>a && (a%2==0 && b%2!=0)) answer++;
        return answer;
    }
}

// 1 2 3 4 5 6 7 8
//  1   2   3   4
//    1       2