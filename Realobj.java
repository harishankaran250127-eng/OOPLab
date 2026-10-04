package Exp4;

class Fan{
	String brand;
	int speed;
	void SwitchOn() {
		System.out.println(brand+" fan switched ON at speed"+speed);
	}
	void SwitchOff() {
		System.out.println(brand+" fan switched OFF");
	}
}
public class Realobj {
	public static void main(String[] args) {
		Fan f=new Fan();
		f.brand="Havells";
		f.speed=3;
		f.SwitchOn();
		f.SwitchOff();
	}
}
