/* Given an array find 2nd largest element 

TC:O(n)
SC: O(1)
*/

import java.io.*;

class sndLargendSmall{
    public static void main(String[] args) throws IOException{
        //input: array

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter values of array");
        String s = reader.readLine();
        String[] st = s.split(" ");

        int len= st.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(st[i]);
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            // smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }

            // largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Smallest: " + secondSmallest);
            System.out.println("Second Largest: " + secondLargest);
        
    }
}

/*

Enter values of array
2 -1 0 7 3 -8 6
Second Smallest: -1
Second Largest: 6

*/