package Exp6;

class Student {
	String name;
	int rollno;
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rollno);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.name="ABC";
		s.rollno=101;
		s.display();
	}
}
