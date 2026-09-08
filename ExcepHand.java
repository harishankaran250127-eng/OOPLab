package Exp2;

import java.util.*;

public class ExcepHand {
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
			try {
				int n=sc.nextInt();
				System.out.println(isPrime(n)?n+" is Prime":n+" is not Prime");
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input! Please enter a valid integer");
				sc.next();
			}
		}
	}
}
