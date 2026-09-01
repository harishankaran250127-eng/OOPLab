package Exp2;

import java.util.Scanner;

public class PrimeCheck 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean prime=true;
		if(n<2)
			prime=false;
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0) {
					prime=false;
					break;
				}
			}
		}
		if(prime)
			System.out.println(n+" is Prime");
		else
			System.out.println(n+" is not Prime");
	}
}
