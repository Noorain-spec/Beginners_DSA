/*
This sorts an array by repeatedly selecting the smallest/largest element from the unsorted portion and swapping it with the first unsorted element.
This process continues until the entire array is sorted.

TC: O(n^2)
SC: O(1)

Note: sorting array in non-decreasing order.
*/

import java.io.*;
import java.util.*;

class SelectionSort{
    private static void selectionSort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter values of array:");
        String st = reader.readLine();
        String[] str = st.split(" ");

        int len = str.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]= Integer.parseInt(str[i]);
        }

        System.out.println("Sorted array (using selection sort): ");
        selectionSort(arr);
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

/*
Enter values of array:
5 8 2 7 1 9 4 11 15 2

Sorted array (using selection sort): 
1	2	2	4	5	7	8	9	11	15

Enter values of array:
5 8 -2 7 1 -9 4 11 -15 2

Sorted array (using selection sort): 
-15	-9	-2	1	2	4	5	7	8	11

Enter values of array:
-20 4 23 5 0 6 -18 99 -0

Sorted array (using selection sort): 
-20	-18	0	0	4	5	6	23	99
*/