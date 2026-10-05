package Exp4;

class Book1{
	String title;
	String author;
	void display() {
		System.out.println("Title:"+title+",Author:"+author);
	}
}
public class SameMultiObj {
	public static void main(String[] args) {
		Book1 b1=new Book1();
		Book1 b2=new Book1();
		Book1 b3=new Book1();
		b1.title="Java Basics";
		b1.author="R.Kumar";
		b2.title="Data Structures";
		b2.author="S.Menon";
		b3.title="Operting System";
		b3.author="A.Verma";
		b1.display();
		b2.display();
		b3.display();
	}
}
