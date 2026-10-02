package Exp4;

class Student5{
	String name;
	int rollNumber;
	void display(){
		System.out.println("Name:"+name+", Roll Number:"+rollNumber);
	}
}
public class MultiObj {
	public static void main(String[] args) {
		Student5 s1=new Student5();
		Student5 s2=new Student5();
		s1.name="Arjun";
		s1.rollNumber=101;
		s2.name="Priya";
		s2.rollNumber=102;
		s1.display();
		s2.display();
	}
}
