package hackerRank;
//Description: Consider an array with N number of consecutive integers, in which few numbers are missing.
//Find and list down these missing numbers using Java.

Missing_arr.java
====================

import java.util.Scanner;

public class Missing_arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Missing numbers are :");
		if(arr[0]!=1)										//if first element is not 1 then write base cond to avoid complexicity
			System.out.print("1");
		for(int i=1;i<n;i++) {								
			if(arr[i]!=(arr[i-1]+1))						//next ele must be +1 of previous
				System.out.print("  "+(arr[i-1]+1));
	}
	}

}

//test case 1
//Enter array size
//4
//Enter array elements: 
//2
//4
//6
//8
//Missing numbers are :
//1  3  5  7
