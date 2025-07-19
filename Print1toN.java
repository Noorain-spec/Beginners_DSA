/*
Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.
You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in increasing order from 1 to n.

Input: n = 5
Output:
1  
2  
3  
4  
5
*/

import java.io.*;
import java.util.*;

class Print1toN{
    private static void printnum(int start, int n){
        if(start<=n) { 
            System.out.println(start);
            printnum(start+1,n);
        }
    }
    public static void main(String[] args) throws IOException{
        //input: number
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number:");
        int num = Integer.parseInt(reader.readLine());

        System.out.println("All numbers from 1 : ");
        printnum(1,Math.abs(num));
    }
}

/*
Enter number:
5
All numbers from 1 : 
1
2
3
4
5

Enter number:
-4
All numbers from 1 : 
1
2
3
4
*/