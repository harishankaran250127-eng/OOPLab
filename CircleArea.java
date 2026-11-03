package Exp5;

class Shape5 {
}
class Circle4 extends Shape5 {
	double radius=7;
	void area() {
		System.out.println("Radius = "+radius);
		System.out.println("Area of Circle = "+(3.14*radius*radius));
	}
}
public class CircleArea {
	public static void main(String[] args) {
		Circle4 c=new Circle4();
		c.area();
	}
}
