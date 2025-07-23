/* Divide and Conquer
TC: O(nlogn) 
SC: O(n)
*/
import java.io.*;
import java.util.*;

class MergeSort{
    private static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int p1=low, p2=mid+1,k=0;

        while(p1<= mid && p2 <=high){
            if(arr[p1]<arr[p2]){
                temp[k]=arr[p1];
                k++;
                p1++;
            }
            else{
                temp[k]=arr[p2];
                k++;
                p2++;
            }
        }

        while(p1<=mid) temp[k++]=arr[p1++];
        while(p2<=high) temp[k++]=arr[p2++]; 

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }
    private static void MS(int[] arr, int low, int high){
        if(low==high) return;
        
        int mid = (low + high)/2;
        MS(arr, low, mid);
        MS(arr, mid+1,high);

        merge(arr, low, mid, high);
    }
    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter array values");
        String st =reader.readLine();
        String[] sts = st.split(" ");

        int[] arr = new int[sts.length];
        int i=0;
        for(String s: sts){
            arr[i] = Integer.parseInt(s);
            i++;
        }

        System.out.println("Merge sorting on array: ");
        MS(arr,0,arr.length-1);

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}

/*

Enter array values
2 5 7 1 0
Merge sorting on array: 
0 1 2 5 7 

Enter array values
-9 7 5 -3 -19
Merge sorting on array: 
-19 -9 -3 5 7 
*/