/*
Given a positive number X,  print its factorial.

To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.
 
Example 1:
Input: X = 5
Output: 120
Explanation: 5! = 5*4*3*2*1
*/

import java.io.*;

class Factorial{
    private static int fact(int n){
        if(n==1 || n==0) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) throws IOException{
        //input: number
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");

        int num = Integer.parseInt(reader.readLine());
        System.out.println("Factorial of number: "+ fact(num) );
    }
}

/*
output:
Enter number:
3
Factorial of number: 6


*/