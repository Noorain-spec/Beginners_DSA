/*
Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same. 
This must be done in place, without making a copy of the array.
*/

import java.io.*;
import java.util.*;

class ZeroToLeft{
    private static void MoveZero(int[] arr, int len){
        int j=0;
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            } 
        }
        while (j < len) {
            arr[j++] = 0;
        }
        
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array nums: ");
        String s = reader.readLine();
        String[] st = s.split(" ");

        int len = st.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = Integer.parseInt(st[i]);
        }

        System.out.println("After moving elements: ");
        MoveZero(arr,len);
    }
}

/*
output:
Enter array nums: 
1 0 2 3 4
After moving elements: 
1 2 3 4 0 

Enter array nums: 
0 1 4 0 5 2
After moving elements: 
1 4 5 2 0 0 

*/