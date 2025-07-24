import java.io.*;
import java.util.*;

class RecursiveInsertion{

    private static void RecurInsert(int[] arr,int len){
        if(len<=1) return;

        RecurInsert(arr, len-1);

        int last= arr[len-1];
        int j=len-2;
        while(j>=0 && arr[j]>last){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=last;
    }
    public static void main(String[] args) throws IOException{
        //input: array

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter array values:");
        String s = reader.readLine();
        String[] st = s.split(" ");

        int len= st.length;
        int[] arr= new int[len];
        for(int i=0;i<len;i++){
            arr[i]= Integer.parseInt(st[i]);
        }

        System.out.println("Recursive Inseration Sort: ");
        RecurInsert(arr, len);
        
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*

Enter array values:
5 -3 8 9 2 0 -4
Recursive Inseration Sort: 
-4 -3 0 2 5 8 9

Enter array values:
0 0 0 0 0
Recursive Inseration Sort: 
0 0 0 0 0
*/