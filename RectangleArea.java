package Exp5;

import java.util.Scanner;

class Shape4 {	
}
class Rectangle1 extends Shape4 {
	double length,width;
	void area() {
		System.out.println("Area of Rectangle = "+(length*width));
	}
}
public class RectangleArea {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Rectangle1 r=new Rectangle1();
		System.out.print("Enter Length:");
		r.length=sc.nextDouble();
		System.out.print("Enter Width:");
		r.width=sc.nextDouble();
		r.area();
	}
}
