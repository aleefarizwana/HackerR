package hackerRank;
//Task 1- WAP in Java to calculate cumulative multiple at each index.
//Task 2 – Push the result into the same Array and Print.
//Task 3 - Handle the exceptions in program


Cumulative_muilt_arr.java
===================================
import java.util.Scanner;
public class Cumulative_muilt_arr {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		try{
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter array elements: ");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				if(i!=0)
					arr[i]*=arr[i-1];
			}
			System.out.println("After cumulative multiple at each index :");
			System.out.print("arrNum = ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+"  ");
		    }
		}
		catch(Exception e) {
			System.out.println(e);
		}
    }
}

//                 	TEST CASE - 1
//Enter the size of array
//6
//Enter array elements: 
//5
//3
//4
//2
//0
//8
//After cumulative multiple at each index :
//arrNum = 5  15  60  120  0  0  



//					TEST CASE - 2
//Enter the size of array
//-6
//java.lang.NegativeArraySizeException: -6
