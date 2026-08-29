package Observation;

import java.util.Scanner;

public class DigitSum 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=scanner.nextInt();
		int a=num%10;
		int b=(num/10)%10;
		int c=num/100;
		int sum=a+b+c;
	    System.out.println("Sum of digits="+sum);
	    scanner.close();
	}
}
