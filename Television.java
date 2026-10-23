package Exp6;

interface RemoteControl{
	void turnOn();
	void turnOff();
}
public class Television implements RemoteControl {
	public void turnOn() {
		System.out.println("Television is ON");
	}
	public void turnOff() {
		System.out.println("Television is OFF");
	}
	public static void main(String[] args) {
		Television t=new Television();
		t.turnOn();
		t.turnOff();
	}

}
