package Exp6;

import java.util.Scanner;

interface Calculator{
	void addition(int a,int b);
}
class Addition implements Calculator {
	public void addition(int a,int b) {
		System.out.println("Sum = "+(a+b));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number:");
		int a=sc.nextInt();
		System.out.print("Enter Second Number:");
		int b=sc.nextInt();
		Addition obj=new Addition();
		obj.addition(a,b);
	}
}
