/*
Sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. 
This algorithm is not suitable for large data sets.

TC: O(n^2)
SC: O(1)
*/

import java.io.*;
import java.util.*;

class BubbleSort{
    private static void BubbleSort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter values of array");
        String st = reader.readLine();
        String[] str = st.split(" ");

        int len = str.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(str[i]);
        }

        System.out.println("Sorted array (using Bubble Sort): ");
        BubbleSort(arr);
        for(int i=0;i<len;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

/*
Enter values of array
5 8 1 3 10 13
Sorted array (using Bubble Sort): 
1	3	5	8	10	13	

Enter values of array
9 34 5 -2 -77 5 0
Sorted array (using Bubble Sort): 
-77	-2	0	5	5	9	34	

*/