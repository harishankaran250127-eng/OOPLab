package Exp3;

import java.util.Scanner;

public class Recursion {
	static void CountDown(int n) {
		if(n<1)
			return;
		System.out.println(n);
		CountDown(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CountDown(n);
	}
}
