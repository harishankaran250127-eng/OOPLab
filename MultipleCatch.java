package Exp7;

import java.util.Scanner;

public class MultipleCatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Result="+(a/b));
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("Invalid Input");
		}
	}
}
