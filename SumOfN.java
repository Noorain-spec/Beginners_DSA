/*
Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.

Input : N = 4
Output : 10
Explanation : first four natural numbers are 1, 2, 3, 4.
Sum is 1 + 2 + 3 + 4 => 10.
*/

import java.io.*;

class SumOfN{
    private static int sum(int n, int s){
        if(n==0) return s;
        if(n<0) return sum(n+1,s+n);
        return sum(n-1,s+n);
    }
    public static void main(String[] args) throws IOException{
        //input: number
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number:");
        int num = Integer.parseInt(reader.readLine());

        System.out.println("sum of first n num:" + sum(num,0));
    }
}

/*
Enter Number:
2
sum of first n num:3

Enter Number:
-2
sum of first n num:-3

Enter Number:
3
sum of first n num:6

*/