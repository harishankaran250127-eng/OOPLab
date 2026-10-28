package Exp5;

class Shape1 {
	void display() {
		System.out.println("Shape Class");
	}
}
class Circle1 extends Shape1 {
	void show() {
		System.out.println("This is Circle Class");
	}
}
public class BasicInherit {
	public static void main(String[] args) {
		Circle1 c=new Circle1();
		c.display();
		c.show();
	}

}
