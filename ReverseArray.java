/*
You are given an array. The task is to reverse the array and print it. 

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
*/

import java.io.*;
import java.util.*;

class ReverseArray{

    private static void re(int[] arr, int i, int j) {
        if (i >= j) return;  
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        re(arr, i + 1, j - 1);
    }

    private static void reverse(int[] arr) {
        re(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size:");
        int size = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter vals:");
        String val = reader.readLine();
        String[] vals = val.split(" ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= Integer.parseInt(vals[i]);
        }
        System.out.println("original array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("reversed array: " + Arrays.toString(arr));
    }
}

/*
Enter size:
5
Enter vals:
1 2 3 4 5
original array: [1, 2, 3, 4, 5]
reversed array: [5, 4, 3, 2, 1]

Enter size:
6
Enter vals:
1 -2 -3 4 9 -7
original array: [1, -2, -3, 4, 9, -7]
reversed array: [-7, 9, 4, -3, -2, 1]
*/