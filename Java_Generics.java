Question 10: Java Generics

Skill Mapping: Basic
Description: Solve the HackerRank Problem given as a link below - 

https://www.hackerrank.com/challenges/java-generics/problem

import java.io.*;
import java.util.Scanner.*;

public class Solution {
    public static <T> void  printArray(T[] arr){
         for(T ele:arr){
            System.out.println(ele);
         }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer a[]={1,2,3};
        String b[]={"Hello","World"};
        
        printArray(a);
        printArray(b);
    }
}

//output
// 1
// 2
// 3
// Hello
// World

// Generic methods are a very efficient way to handle multiple datatypes using a single method. 
// This problem will test your knowledge on Java Generic methods.
// Let's say you have an integer array and a string array.
// You have to write a single method printArray that can print all the elements of both arrays. 
// The method should be able to accept both integer arrays or string arrays.
