package Anudip;

	import java.util.Scanner;
	public class BubbleSort {
		public static void main(String args[])
		{
		 int[] arr= {56,89,34,27,12};
		 int n=arr.length;
		 int temp ;
		for(int i=0;i<n;i++) {
			 for(int j=0;j<n-1;j++) {
				 if(arr[i]>arr[j+1]) {
					temp = arr[j]; //swaping the number if one number is greater than other
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				 }
			 }
		  }
		 System.out.println("Sorted array:");
		 for(int i=0;i<n;i++)
			 System.out.println(arr[i]);
		}
	}
