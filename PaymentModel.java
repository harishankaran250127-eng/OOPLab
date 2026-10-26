package Exp6;

interface Payment{
	void pay(double amout);
	void generateReceipt();
}
class CashPayment implements Payment{
	public void pay(double amount) {
		System.out.println("Cash Payment: Rs."+amount);
	}
	public void generateReceipt() {
		System.out.println("Cash Payment Receipt Generated");
	}
}
class OnlinePayment implements Payment{
	public void pay(double amount) {
		System.out.println("Online Payment: Rs."+amount);
	}
	public void generateReceipt() {
		System.out.println("Online Payment Receipt Generated");
	}
}
public class PaymentModel {
	public static void main(String[] args) {
		CashPayment c=new CashPayment();
		OnlinePayment o=new OnlinePayment();
		c.pay(500);
		c.generateReceipt();
		o.pay(1200);
		o.generateReceipt();
	}
}
