 package Exp5;

class Shape10 {
	void display() {
		System.out.println("Area Calculation");
	}
}
class Circle9 extends Shape10 {
	double radius=5;
	void area() {
		System.out.println("Area of Circle="+(3.14*radius*radius));
	}
}
class Rectangle5 extends Shape10 {
	double length=10;
	double width=5;
	void area() {
		System.out.println("Area of Rectangle="+(length*width));
	}
}
public class CompleteInherit {
	public static void main(String[] args) {
		Circle9 c=new Circle9();
		Rectangle5 r=new Rectangle5();
		c.display();
		c.area();
		r.area();
	}
}
