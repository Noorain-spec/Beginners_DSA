/*
Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. 
The relative order of the elements should be kept the same.
If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. 
It does not matter what you leave beyond the first k elements.

 Return k after placing the final result in the first k slots of the array.
*/

import java.io.*;

class RemoveDup{

    private static int removeDup(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(new System.in));

        String s = reader.readLine();
        String[] st = s.split(" ");

        int len = st.length;
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i]= Integer.parseInt(st[i]);
        }

        int k = removeDup(arr);
        System.out.println("Array after removing duplicate elements: ");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}