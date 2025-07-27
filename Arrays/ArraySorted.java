/*

Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. 
If the array is sorted then return True, Else return False.

*/

import java.io.*;

class ArraySorted{
    private static boolean sorted(int[] arr, int index){
        if (index >= arr.length - 1) return true;  
        if (arr[index] > arr[index + 1]) return false;  
        return isSorted(arr, index + 1); 
    }
    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter values of array");
        String s = reader.readLine();
        String[] st= s.split(" ");

        int len=st.length;
        int[] arr = new int[len];

        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(st[i]);
        } 

        System.out.println(sorted(arr,0,1));
    }
}

/*

Enter values of array
2 -1 0 7 3 -8 6
false

*/