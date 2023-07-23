Question 4: Java Arraylist

Skill Mapping: Basic
Description: Solve the HackerRank Problem given as a link below - 
https://www.hackerrank.com/challenges/java-arraylist/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> arr =new ArrayList<ArrayList<Integer>>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ArrayList<Integer> tmp=new ArrayList<Integer>();
            int d=sc.nextInt();
            tmp.add(d);
            for(int j=0;j<d;j++){
                tmp.add(sc.nextInt());
            }
            arr.add(tmp);
        }
        
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int r=sc.nextInt()-1;
            int c=sc.nextInt();
            if(r<n && c<=arr.get(r).get(0))
                System.out.println(arr.get(r).get(c));
            else System.out.println("ERROR!");
        }
        
    }
}
