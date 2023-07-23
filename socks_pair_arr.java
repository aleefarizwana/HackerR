package hackerRank;
//Description: Consider data with assorted details of socks pair IDs.
//Each element in the array represents a number of similar pairs. 
//You will have to find out how many singular socks are present which do not have any pair left.
//Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}
//Output: Count of singular socks = 3


socks_pair_arr.java
=============================
import java.util.Scanner;

public class socks_pair_arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		                                               // sorting elements of array
		int t=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<=arr[j]) {
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
		}
		}
													//increment count till same element present in array consecutively 
		int count;									//because we sorted the array
		int s=0;									//then need to skip iterating through all consecutive duplicate elements
		for(int i=0;i<n;i=i+count) {				//so update **....i to i+count....** (it takes next non duplicate element)
			count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count %2!=0)
				s++;
		}
		System.out.println("Count of Singular socks = "+s);
	}

}

//			TEST CASE 1
//Enter array size
//9
//Enter array elements: 
//10 20 20 10 10 30 50 10 20
//Count of Singular socks = 3


//			TEST CASE 2
//Enter array size
//4
//Enter array elements: 
//20
//20
//20
//20
//Count of Singular socks = 0
