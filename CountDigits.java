/* 
You are given an integer n. You need to return the number of digits in the number. 

The number will have no leading zeroes, except when the number is 0 itself.

Input: n = 4
Output: 1
Explanation: There is only 1 digit in 4.
*/

import java.io.*;

class CountDigits{
    private int digitsCount(int n){
        int count=0;
        if (n==0) return 1;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static void main (String[] args) throws IOException{
        //input: a number
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(reader.readLine());

        // create instance to call non-static method
        CountDigits sol = new CountDigits();
        System.out.println("Number of digits in number: " + sol.digitsCount(num));
    }
}