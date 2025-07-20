/*
Given an array of size N. Find the highest and lowest frequency element.

Example 1:
Input: array[] = {10,5,10,15,10,5};
Output: 10 15
Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

*/

import java.io.*;
import java.util.*;

class HighnLow{
    public static void main(String[] args) throws IOException{
        //input: array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter array values");
        String st = reader.readLine();
        String[] str = st.split(" ");

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(String s : str){
            int val = Integer.parseInt(s);
            if(mp.containsKey(val)){
                int x= mp.get(val);
                mp.put(val,x+1);
            }
            else{
                mp.put(val,1);
            }
        }

        int n = mp.size();
        int maxEle = 0, minEle = 0;
        int maxFreq = 0, minFreq = n;
        
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
}

/*

Enter array values
1 3 3 5 6 1 7 7 7 8
The highest frequency element is: 7
The lowest frequency element is: 5

*/