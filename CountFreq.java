/*
Given an array, we have found the number of occurrences of each element in the array.

Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array
*/

import java.io.*;
import java.util.*;

class CountFreq{
    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter array vals:");
        String st =reader.readLine();
        String[] str = st.split(" ");

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(String s : str){
            int val = Integer.parseInt(s);
            if(mp.containsKey(val)){
                int x = mp.get(val);
                mp.put(val,x+1);
            }
            else{
                mp.put(val,1);
            }
        }

        //Print count
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            System.out.print(entry.getKey() + "\t");
            System.out.println(entry.getValue());
        }
    }
}

/*
Time Complexity: O(N)
Space Complexity: O(n)

output:

Enter array vals:
1 2 5 7 2 5 1 8 10
1	2
2	2
5	2
7	1
8	1
10	1

*/
