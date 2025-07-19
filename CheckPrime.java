/* You are given an positive integer n. You need to check if the number is prime or not. Return true if it is a prime number, otherwise return false.

Input: n = 5
Output: true
Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.
*/

import java.io.*;
import java.util.*;

class CheckPrime{
    private boolean primeNum(int maxNum){
        boolean[] isPrime = new boolean[maxNum + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int p = 2; p * p <= maxNum; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= maxNum; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime[maxNum];
    }
    
    public static void main(String[] args) throws IOException{
        //input: number
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number");
        int num= Integer.parseInt(reader.readLine());

        CheckPrime sol = new CheckPrime();
        System.out.println("Prime? "+ sol.primeNum(num));
    }
}

/* output:

Enter number
27
Prime? false

Enter number
29
Prime? true

Enter number
022
Prime? false
*/