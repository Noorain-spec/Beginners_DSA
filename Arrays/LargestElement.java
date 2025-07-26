/* given an array find the largest element using recursive apprach

TC: O(n)
SC: O(n)
*/

import java.io.*;

class LargestElement{
    
    private static int Largest(int[] arr,int ele,int idx){
        if(idx==arr.length) return ele;
        
        if(arr[idx]>ele) ele = arr[idx];
        
        return Largest(arr, ele, idx+1);
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
        int ele = Integer.MIN_VALUE;
        System.out.println("Largest Element: "+ Largest(arr,ele,0));

        /*
        
        For large arrays, prefer iteration to avoid stack overflow
        int largest = arr[0];
        for (int num : arr) if (num > largest) largest = num;

        */
        
    }
}

/*
2 7 5 8 0 1
Largest Element: 8
*/

