package Anudip;
import java.util.Scanner;

public class EvenOdd {
	static void checkNum(int n) {
		if(n%2==0) {
			System.out.println(n+"is even number");
		}else {
			System.out.println(n+"is odd number");
		}
	}

	public static void main(String[] args) {
		int num;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		checkNum(num);
	}

}
