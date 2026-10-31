package Exp5;

class Shape2 {
	String color="Red";
}
class Circle2 extends Shape2 {
	void display() {
		System.out.println("Shape color="+color);
	}
}
public class VariableInherit {
	public static void main(String[] args) {
		Circle2 c=new Circle2();
		c.display();
	}
}
