/*
Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. 
The elements in the union must be in ascending order.

The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.

TC: O(m + n)
SC: O(m + n)
*/

import java.io.*;
import java.util.*;

class UnionSortedArrays{
    private static int[] ArrayUnion(int[] a1, int[] a2,int l1, int l2){
        List<Integer> res = new ArrayList<>();

        int i=0,j=0;
        while(i<l1 && j <l2){
            if(a1[i]==a2[j]){
                if(res.isEmpty() || res.get(res.size() - 1) != a1[i]){
                    res.add(a1[i]);
                }
                i++;
                j++;
            }
            else{
                if(a1[i]<a2[j]){
                    if(res.isEmpty() || res.get(res.size() - 1) != a1[i]){
                        res.add(a1[i]);
                    }
                    i++;
                }
                else{
                    if(a1[i]>a2[j]){
                        if(res.isEmpty() || res.get(res.size() - 1) != a2[j]){
                            res.add(a2[j]);
                        }
                        j++;
                    }
                }
            }
            
        }
        while(j<l2){
            if(res.isEmpty() || res.get(res.size() - 1) != a2[j]){
                res.add(a2[j]);
            }
            j++;
        }

        while(i<l1){
            if(res.isEmpty() || res.get(res.size() - 1) != a1[i]){
                res.add(a1[i]);
            }
            i++;
        }

        // Convert List<Integer> to int[]
        int[] result = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            result[k] = res.get(k);
        }
        return result;

    }

    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array1: ");
        String s = reader.readLine();
        String[] st = s.split(" ");

        int len1 = st.length;
        int[] arr1 = new int[len1];
        for(int i=0;i<len1;i++){
            arr1[i] = Integer.parseInt(st[i]);
        }

        System.out.println("Enter array2: ");
        String s2 = reader.readLine();
        String[] st2 = s2.split(" ");

        int len2 = st2.length;
        int[] arr2 = new int[len2];
        for(int i=0;i<len2;i++){
            arr2[i] = Integer.parseInt(st2[i]);
        }

        int[] res= ArrayUnion(arr1, arr2,len1,len2);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}

/*

Enter array1: 
1 2 3 4 5
Enter array2: 
1 2 7
1 2 3 4 5 7

Enter array1: 
1 2 7 8 10
Enter array2: 
2 3 4 10
1 2 3 4 7 8 10 

Enter array1: 
1 2 3 
Enter array2: 
0 1 5 6
0 1 2 3 5 6 

*/