package Exp3;

import java.util.Scanner;

public class FiboUser {
	static int fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Fibonacci Sequence:");
		for(int i=0;i<n;i++)
			System.out.print(fib(i)+" ");
	}
}
