package Exp2;

import java.util.Scanner;

public class PrimeCase {
	static boolean IsPrime(int n) {
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
		try {
			String s=sc.nextLine();
			String []a=s.split(" ");
			if(a.length==1) {
				int n=Integer.parseInt(a[0]);
				if(IsPrime(n))
					System.out.println(n+" is Prime");
				else
					System.out.println(n+" is not Prime");
			}
			else {
				int start=Integer.parseInt(a[0]);
				int end=Integer.parseInt(a[1]);
				System.out.print("Prime numbers between "+start+" and "+end+" : ");
				for(int i=start;i<=end;i++) {
					if(IsPrime(i))
						System.out.print(i+" ");
				}
			}
		}
		catch(Exception e) {
			System.out.println("Invalid input! Please enter a valid integer.");
		}
	}
}
