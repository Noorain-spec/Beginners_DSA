/*
You are given an integer n. You need to check whether the number is a palindrome number or not. 
Return true if it's a palindrome number, otherwise return false.

A palindrome number is a number which reads the same both left to right and right to left.

Input: n = 121
Output: true

*/

import java.io.*;

class Palindrome{
    private boolean checkPalindrome(int num){
        /* 
        Idea-1:
        - reverse number and compare - TC: O(logn) ; SP: O(1)
        */
        if(num<0) return false;
        if(num>=0 && num<=9) return true;
        int rnum=0;
        int cnum= num;
        while(num!=0){
            int temp=num%10;
            num=num/10;
            rnum=rnum*10+temp;
        }
        return rnum == cnum; 
       /*
        Idea-2:
        - find digits count
        - check numbers from start and last till count/2 - TC: O(log₁₀ n) SP: O(1)
    
        if(num>=0 && num<=9) return true;
        if(num<0) return false;

        int digitCount = (int) Math.log10(num) +1; //counting digits
        int pow = (int) Math.pow(10, digitCount-1) ;
        
        for (int i = 0; i < digitCount / 2; i++){
            int ldigit = num%10;
            int fdigit = num /pow ;

            if(fdigit!=ldigit) return false;

            num = (num%pow)/10; //remove last and first digit
            pow = pow/100;
        }
        return true;
        */
    }
    public static void main(String[] args) throws IOException{
        //input: a number
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");
        int num= Integer.parseInt(reader.readLine());

        //instance to call non-staic fun
        Palindrome sol= new Palindrome();
        System.out.println("Number is Palindrome?"+ sol.checkPalindrome(num));
    }
}

/* 
output:

Enter number:
3
Number is Palindrome?true

Enter number:
-121
Number is Palindrome?false

Enter number:
1231
Number is Palindrome?false

Enter number:
00500
Number is Palindrome?false
*/