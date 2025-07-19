/*
Given two integers N1 and N2, find their greatest common divisor.

Input: n1 = 4, n2 = 6
Output: 2
Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6
Greatest Common divisor = 2.
*/

import java.io.*;
import java.util.*;

class GCD{

    /* 
    Idea-1:
    find all divisors of n1 & n2
    search for elements from smallest divisor array in other

    TC: O(k * m) ≈ O(n1 * n2)
    SC: O(√n1 + √n2)
    */
    private int gcd1(int n1,int n2){
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        for(int i=2;i<=n1;i++){
            if(n1%i==0){
                arr1.add(i);
            }
        }
        for(int i=2;i<=n2;i++){
            if(n2%i==0){
                arr2.add(i);
            }
        }

        int gcdnum=1;
        for(int i=0;i<arr1.size();i++){
            if(arr2.contains(arr1.get(i))) gcdnum=arr1.get(i); 
        }
        return gcdnum;
    }

   /* 
   Idea-2:
   Finds the smaller of n1 and n2 (smallnum).
   Iterates from 2 to smallnum to check for common divisors.
   Updates gcdnum whenever a common divisor is found.

   TC: O(min(n1, n2))
   SC: O(1)
   */
    private int gcd2(int n1, int n2){
        int smallnum =0; 
        int othernum= 0;

        if(n1<=n2) {smallnum = n1; othernum= n2; }
        else {smallnum = n2; othernum= n1; }

        int gcdnum=1;
        for(int i=2;i<=smallnum;i++){
            if( smallnum%i==0 && othernum%i==0 ) gcdnum = i;
        }
        return gcdnum;
    }

    /*
    Idea-3:
    factors repeate after sqrt(num)

    TC: O(√min(n1, n2))
    */
    private int gcd3(int n1, int n2){
        int smallnum =0; 
        int othernum= 0;

        if(n1<=n2) {smallnum = n1; othernum= n2; }
        else {smallnum = n2; othernum= n1; }

        int gcdnum=1;
        for (int i = 2; i * i <= smallnum; i++) {
            if (smallnum % i == 0 && othernum % i == 0) {
                gcdnum = i;
            }
        }
        return gcdnum;
    }
    /*
    Idea-4: 
    Euclidean Algorithm (recursive)

    TC: O(log(min(n1, n2)))
    SC: O(log(min(n1, n2))) 
    */
    private int gcd4(int a, int b) {

        // As GCD(48, 18) = GCD(18, 12) = GCD(12, 6) = GCD(6, 0) = 6

        if (b == 0) {
            return a;  // Base case: GCD(a, 0) = a
        }
        return gcd(b, a % b);
    }

    /*
    Idea-5:
    Euclidean (Iterative)

    TC: O(log(min(n1, n2)))
    SC: O(1)
    */
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static void main(String[] args) throws IOException{
        //input: space seperated number
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers:");
        String inputs = reader.readLine();
        
        // split string
        String[] numbers = inputs.split(" ");
        int n1= Integer.parseInt(numbers[0]);
        int n2= Integer.parseInt(numbers[1]);

        GCD sol = new GCD();
        n1 = Math.abs(n1); 
        n2 = Math.abs(n2);
        System.out.println("GCD of numbers:"+ sol.gcd(n1, n2));
    }
}

/* 
output:
Enter numbers:
4 6
GCD of numbers:2

Enter numbers:
121 55
GCD of numbers:11

Enter numbers:
59 3
GCD of numbers:1

Enter numbers:
5 2
GCD of numbers:1
*/