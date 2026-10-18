package Exp6;

class Student1{
	void displayStudent() {
		System.out.println("Student Name:ABC");
		System.out.println("Roll Number:101");
	}
}
class Teacher{
	void displayTeacher() {
		System.out.println("Teacher Name:DCBA");
		System.out.println("Subject:Java");
	}
}
class MultiClass {
	public static void main(String[] args) {
		Student1 s=new Student1();
		Teacher t=new Teacher();
		s.displayStudent();
		t.displayTeacher();
	}
}
