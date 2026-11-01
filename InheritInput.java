package Exp5;

import java.util.Scanner;

class Shape3{	
}
class Circle3 extends Shape3{
	double radius;
	void area() {
		System.out.println("Area of Circle = "+(3.14*radius*radius));
	}
}
public class InheritInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle3 c=new Circle3();
		System.out.print("Enter Radius:");
		c.radius=sc.nextDouble();
		c.area();
	}
}
