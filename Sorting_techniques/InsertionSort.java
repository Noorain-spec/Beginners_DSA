/*

sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list. 

TC: O(n^2)
SC: O(1)
*/

import java.io.*;
import java.util.*;

class InsertionSort{
    private static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i=1;i<len;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp= arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        //input: aary
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter values of array");
        String st = reader.readLine();
        String[] str = st.split(" ");

        int len = str.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(str[i]);
        }

        System.out.println("Sorted array (using Insertion Sort): ");
        insertionSort(arr);
        for(int i=0;i<len;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

/*
Enter values of array
5 4 3 2 1
Sorted array (using Insertion Sort): 
1	2	3	4	5

Enter values of array
-9 5 7 -1 6
Sorted array (using Insertion Sort): 
-9	-1	5	6	7	
*/