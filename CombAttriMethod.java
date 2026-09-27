package Exp4;

class Student4{
	String name;
	int rollNumber;
	void Details() {
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rollNumber);
	}
}
public class CombAttriMethod {
	public static void main(String[] args) {
		Student4 s=new Student4();
		s.name="Priya";
		s.rollNumber=102;
		s.Details();
	}
}
