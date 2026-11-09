package Exp5;

import java.util.Scanner;

class Shape{
	void calculateArea() {
		System.out.println("Area of Shape:");
	}
}
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	void calculateArea() {
		System.out.println("Area of Circle="+(3.14*radius*radius));
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	void calculateArea() {
		System.out.println("Area of Rectangle="+(length*width));
	}
}
public class ShapeMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius=");
		double radius=sc.nextDouble();
		System.out.print("Length=");
		double length=sc.nextDouble();
		System.out.print("Width=");
		double width=sc.nextDouble();
		Shape c=new Circle(radius);
		Shape r=new Rectangle(length,width);
		c.calculateArea();
		r.calculateArea();
		sc.close();
	}
}
