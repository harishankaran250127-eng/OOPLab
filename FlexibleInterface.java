package Exp6;

interface Payment1{
	void pay(double amout);
	void generateReceipt();
}
class CashPayment1 implements Payment{
	public void pay(double amount) {
		System.out.println("Cash Payment: Rs."+amount);
	}
	public void generateReceipt() {
		System.out.println("Cash Payment Receipt Generated");
	}
}
class OnlinePayment1 implements Payment{
	public void pay(double amount) {
		System.out.println("Online Payment: Rs."+amount);
	}
	public void generateReceipt() {
		System.out.println("Online Payment Receipt Generated");
	}
}
public class FlexibleInterface {
	public static void main(String[] args) {
		Payment p1=new CashPayment1();
		Payment p2=new OnlinePayment1();
		p1.pay(500);
		p1.generateReceipt();
		p2.pay(1200);
		p2.generateReceipt();
	}
}
