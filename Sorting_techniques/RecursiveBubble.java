import java.io.*;
import java.util.*;

class RecursiveBubble{
    private static void BubbleSort(int[] arr,int len){

        if(len==1) return;

        int count=0;
        for(int i=0;i<len-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count++;
            }

            if(count==0) return;
            BubbleSort(arr,len-1);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Array values");
        String st = reader.readLine();
        String[] sts = st.split(" ");

        int len =sts.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = Integer.parseInt(sts[i]);
        }

        System.out.println("Recursive Bubble Sort: ");
        BubbleSort(arr,len);

        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*
Enter Array values
-9 7 5 -3 -19
Recursive Bubble Sort: 
-9 7 5 -3 -19 
*/