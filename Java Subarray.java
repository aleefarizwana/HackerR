Question 3: Java Subarray

// The sum of an array is the total sum of its elements.
// An array's sum is negative if the total sum of its elements is negative.
// An array's sum is positive if the total sum of its elements is positive.

  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        int count = 0;
        for(int i = 0;i<n;i++){
            int tot = arr[i];
            if (tot < 0){             //ele is negative
                count += 1;
            }
            for(int j = i+1;j<n;j++){    
                tot += arr[j];             //adding all ele after that ele 
                if (tot < 0){   //if that tot less                             
                    count += 1; //than zero 
                }
            }
        }
        System.out.println(count);
    }
    }

// Input (stdin)
// 5
// 1 -2 4 -5 1
// Your Output (stdout)
// 9
// Expected Output
// 9
