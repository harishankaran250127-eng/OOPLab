package Exp4;

class Book3{
	String title;
	String author;
}
public class DefAttri {
	public static void main(String[] args) {
		Book3 b=new Book3();
		System.out.println("Default Values:");
		System.out.println("Title:"+b.title+", Author:"+b.author);
		b.title="Java Basics";
		b.author="R.Kumar";
		System.out.println("After assigning values:");
		System.out.println("Title:"+b.title+", Author:"+b.author);
	}
}
