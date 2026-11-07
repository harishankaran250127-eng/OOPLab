package Exp5;

class Shape9 {
	void display() {
		System.out.println("Shape Class Method");
	}
}
class Circle8 extends Shape9 {
	void area() {
		System.out.println("Circle Area=78.5");
	}
}
class Rectangle4 extends Shape9 {
	void area() {
		System.out.println("Rectangle Area=50");
	}
}
public class InheritDemo {
	public static void main(String[] args) {
		Circle8 c=new Circle8();
		Rectangle4 r=new Rectangle4();
		c.display();
		c.area();
		r.display();
		r.area();
	}

}
