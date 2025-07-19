/* You are given an integer n. Return the integer formed by placing the digits of n in reverse order. 

Input: n = 25
Output: 52
Explanation: Reverse of 25 is 52.

*/

import java.io.*;

class ReverseNumbers{
    private int reverseNum(int num){
        if(num==0) return 0;
        int rnum=0;
        while(num!=0){
            int temp=num%10;
            num=num/10;
            rnum=rnum*10+temp;
        }
        return rnum;
    }

    public static void main(String[] args) throws IOException{
        //input: number
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number:");
        int num = Integer.parseInt(reader.readLine());

        //instance to call non-static fun
        ReverseNumbers sol = new ReverseNumbers();
        System.out.println("reversed number:" + sol.reverseNum(num));
    }
}

/* 

output: enter number:
100
reversed number:1

enter number:
76809
reversed number:90867

*/