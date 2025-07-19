/*
You are given an positive integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.

Input: n = 6
Output = [1, 2, 3, 6]
Explanation: The divisors of 6 are 1, 2, 3, 6.
*/

import java.io.*;
import java.util.*;

class AllDivisors{
    private List<Integer> divisors(int num){
        /*idea: numbers repeat after sqrt(num)

        TC: O(√n)
        SC: O(d) d: no.of divisors
        */
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                arr.add(i);
                if( num/i != i)
                    arr.add(num/i);
            }
        }
        return arr;
    }

    
    public static void main(String[] args)throws IOException{
        //input: number
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number:");
        int num= Integer.parseInt(reader.readLine());

        AllDivisors sol = new AllDivisors();
        num= Math.abs(num);
        System.out.println("divisors of num:"+ sol.divisors(num));
    }
}

/*
Enter number:
5
divisors of num:[1, 5]

Enter number:
10
divisors of num:[1, 10, 2, 5]

Enter number:
25
divisors of num:[1, 25, 5]

Enter number:
36
divisors of num:[1, 36, 2, 18, 3, 12, 4, 9, 6]
*/