package Exp5;

class Shape7 {
	void display() {
		System.out.println("Display Method in Shape Class");
	}
}
class Circle6 extends Shape {
	void display() {
		System.out.println("Display Method in Circle Class");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Circle6 c=new Circle6();
		c.display();
	}
}
