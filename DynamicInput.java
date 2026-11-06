package Exp5;

import java.util.Scanner;

class Shape8 {
}
class Circle7 extends Shape8 {
	double radius;
	void area() {
		System.out.println("Area of Circle="+(3.14*radius*radius));
	}
}
class Rectangle3 extends Shape8 {
	double length,width;
	void area() {
		System.out.println("Area of Rectangle="+(length*width));
	}
}
public class DynamicInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle7 c=new Circle7();
		Rectangle3 r=new Rectangle3();
		System.out.print("Enter Radius:");
		c.radius=sc.nextDouble();
		c.area();
		System.out.print("Enter Length:");
		r.length=sc.nextDouble();
		System.out.print("Enter Width:");
		r.width=sc.nextDouble();
		r.area();
	}
}
