/* 
Quick Sort is a divide-and-conquer algorithm like the Merge Sort. 
But unlike Merge sort, this algorithm does not use any extra array for sorting.
*/

import java.io.*;

class QuickSort{
    private static int parti(int[] arr, int low,int high){
        int pivot=arr[low];
        int i=low;
       int j=high;

        while(i<j){
            while(arr[i]<= pivot && i<=high-1){
                i++;
            }

            while(arr[j]> pivot && j>=low+1){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp =arr[low];
        arr[low]= arr[j];
        arr[j]= temp;

        return j;
    }

    private static void quickSort(int[] arr, int low,int high){
        if(low<high){
            int pivotIdx = parti(arr, low, high);

            quickSort(arr, low, pivotIdx-1);

            quickSort(arr,pivotIdx+1, high); 
        }
    }
    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter values of array");
        String st = reader.readLine();
        String[] sts  = st.split(" ");

        int len = sts.length;
        int[] arr = new int[len];

        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(sts[i]);
        }

        System.out.println("Sorted array by Quick Sort: ");
        quickSort(arr,0,len-1);
        
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*
Enter values of array
2 7 5 8 0 1
Sorted array by Quick Sort: 
0 1 2 5 7 8
*/