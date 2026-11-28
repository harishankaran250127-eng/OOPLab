package Exp7;

import java.util.Scanner;

public class ExcepUserFriendly {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Divide");
		System.out.println("2.Exit");
		int choice=sc.nextInt();
		if(choice==1) {
			try {
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Result="+(a/b));
			}
			catch(ArithmeticException e) {
				System.out.println("Error:Division by zero is not allowed");
			}
			catch(java.util.InputMismatchException e ) {
				System.out.println("Error:Please enter integers only");
			}
		}
		else {
			System.out.println("Program ended");
		}
	}
}
