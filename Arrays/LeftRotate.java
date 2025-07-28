/*
Given an array of N integers, left rotate the array by one place.

Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1

*/

import java.io.*;

class LeftRotate{
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void leftRotate(int[] arr, int n) {
        if(n!=arr.length){
            n = n % arr.length; 
            reverse(arr, 0, arr.length - 1);
            reverse(arr, 0, arr.length - n - 1);
            reverse(arr, arr.length - n, arr.length - 1);
        }
    }
        
    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter rotation num: ");
        int r = Integer.parseInt(reader.readLine());

        System.out.println("enter values of array:");
        String s = reader.readLine();
        String[] st = s.split(" ");

        int len = st.length;
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i]= Integer.parseInt(st[i]);
        }

        System.out.println("Array after roatation: ");
        leftRotate(arr,r);
        
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

/*

Enter rotation num: 
3
enter values of array:
1 2 3 4 5 6
Array after roatation: 
4 5 6 1 2 3 

*/