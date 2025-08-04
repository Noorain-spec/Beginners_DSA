/*
Given an array, and an element num the task is to find if num is present in the given array or not. 
If present print the index of the element or print -1.

TC: O(n)
SC: O(1)
*/

import java.io.*;

class LinearSearch{
    public static int present(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num) return i;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter num: ");
        int num = Integer.parseInt(reader.readLine());

        System.out.println("Enter array nums: ");
        String s = reader.readLine();
        String[] st = s.split(" ");

        int len = st.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = Integer.parseInt(st[i]);
        }

        int t = present(arr, num);
        if(t!=-1) System.out.print("Element Present: "+ t);
        else{System.out.println("no element: "+ t);}

    }
}

/*

Enter num: 
6
Enter array nums: 
1 2 4 5 6 7
Element Present: 4

Enter num: 
9
Enter array nums: 
1 2 3 4 5 
no element: -1

Enter num: 
2
Enter array nums: 
1 2 3 2 4 5
Element Present: 1

*/