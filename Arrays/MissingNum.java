/*
Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), 
return the only number missing from the array within this range.

TC: O(n)
SC: O(1)
*/

import java.io.*;
import java.util.*;

class MissingNum{
    private static int missingNum(int[] arr, int n){
        int num=0;
        switch ((n) % 4) {
            case 0: num=n; break;
            case 1: num=1; break;
            case 2: num=n + 1; break;
            case 3: num=0; break;
            default: num=0; // unreachable for n ≥ 0
        }

        for(int i=0;i<n;i++){
            num= num ^ arr[i];
        }

        return num;
    }
    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter values of continous array: ");
        String s = reader.readLine();
        String[] st = s.split(" ");

        int len = st.length;
        int[] arr = new int[len];

        int max_num=Integer.MIN_VALUE;

        for(int i=0;i<len;i++){
            arr[i] = Integer.parseInt(st[i]);
            if(arr[i]>max_num){
                max_num=arr[i];
            }
        }

        System.out.println("Missing num: "+ missingNum(arr, len));

    }
}

/*
enter values of continous array: 
0 1 3 4 5 6
Missing num: 2

enter values of continous array: 
1 2 3 4 5
Missing num: 0

*/