package Exp5;

class Shape6 {
}
class Circle5 extends Shape6 {
	void area() {
		System.out.println("Area of Curcle=78.5");	
		}
}
class Rectangle2 extends Shape6 {
	void area() {
		System.out.println("Area of Rectangle=50");
	}
}
public class HierarchicalInherit {
	public static void main(String[] args) {
		Circle5 c=new Circle5();
		Rectangle2 r=new Rectangle2();
		c.area();
		r.area();
	}
}
