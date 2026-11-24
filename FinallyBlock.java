package Exp7;

import java.util.Scanner;

public class FinallyBlock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			System.out.println("Result="+(a/b));
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Caught");
		}
		finally {
			System.out.println("Program execution completed");
		}
	}
}
