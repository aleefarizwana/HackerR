Question 6: Java List

Skill Mapping: Basic
Description: Solve the HackerRank Problem given as a link below - 

https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        List<Integer> L =new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            L.add(num);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            String query = sc.next();
            if(query.equals("Insert")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                L.add(x,y);
                n++;
            }
            else{
                int x=sc.nextInt();
                L.remove(x);
                n--;
            }
        }
        for(int i=0;i<n;i++){                    //or can use L.size()
            System.out.print(L.get(i)+" ");
        }
    }
}
