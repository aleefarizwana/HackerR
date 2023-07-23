Question 8: Java Hashset

Skill Mapping: Basic
Description: Solve the HackerRank Problem given as a link below - 

https://www.hackerrank.com/challenges/java-hashset/problem

// add this code 
HashSet <String>se=new HashSet<>();
        for (int i = 0; i < t; i++) {
            se.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(se.size());
        }

//full program 


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet <String>se=new HashSet<>();
        for (int i = 0; i < t; i++) {
            se.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(se.size());
        }
        //int count=1;
//Write your code here
        // for (int i = 2; i < t; i++) {
        //     for (int j = 2; j <= i; j++) {
        //         if(pair_left[i]!=pair_left[j] && pair_right[i]!= pair_right[j])
        //             count++;
               
        // }
        // System.out.println(count);
        // }
   }
}


// Input (stdin)
// 5
// john tom
// john mary
// john tom
// mary anna
// mary anna
// Your Output (stdout)
// 1
// 2
// 2
// 3
// 3
