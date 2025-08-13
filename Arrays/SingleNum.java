/*
Given an array of nums of n integers. Every integer in the array appears twice except one integer. 
Find the number that appeared once in the array.

TC: O(n)
SC: O(1)
*/

import java.io.*;

class SingleNume{
    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter array: ");
        String s = reader.readLine();
        String[] st = s.split(" ");

        int len = st.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(st[i]);
        }

        int num= arr[0];
        for(int i=1;i<len;i++){
            num=num^arr[i];
        }

        System.out.println("Single Number: "+ num);
    }
}

/*

enter array: 
1 2 2 3 3 4 4
Single Number: 1

enter array: 
2 3 4 6 4 2 3
Single Number: 6

enter array: 
1 2 0 3 7 7 2 1 3
Single Number: 0

*/