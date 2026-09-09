package Exp2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleNumbers {
	static boolean isPrime(int n) {
		if(n<2)
			return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("Enter a number (0 to quit): ");
			int n=sc.nextInt();
			if(n==0) {
				System.out.println("Exiting program");
				break;
			}
			System.out.println(isPrime(n)?n+" is Prime":n+" is not Prime");
		}
	}
}
