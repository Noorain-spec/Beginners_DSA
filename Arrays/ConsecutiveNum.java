/*
Given a binary array nums, return the maximum number of consecutive 1s in the array.
A binary array is an array that contains only 0s and 1s.

TC: O(n)
SC: O(1)
*/

import java.io.*;
import java.util.*;

class ConsecutiveNum{
    public static void main(String[] args) throws IOException{
        //input: array (1's & 0's)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter array (0's & 1's): ");
        String s = reader.readLine();
        String[] st = s.split(" ");

        int len = st.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(st[i]);
        }

        int start=0, last=0;
        for(int i=0;i<len;i++){
            if(arr[i]==1){
                start++;
                last = Math.max(last, start);
            }
            else{
                start=0;
            }
        }

        System.out.println("Max len of consecutive 1's: "+ last);

    }
}

/*
enter array (0's & 1's): 
1 1 1 0 1 1
Max len of consecutive 1's: 3

enter array (0's & 1's): 
0 1 0 0 0
Max len of consecutive 1's: 1

enter array (0's & 1's): 
0 0 0 0 0
Max len of consecutive 1's: 0

*/