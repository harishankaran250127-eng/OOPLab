package Exp4;

class Car{
	String model;
	String color;
	Car(){
	}
	Car(String model,String color){
		this.model=model;
		this.color=color;
	}
	void start() {
		System.out.println(model+"("+color+") has started.");
	}
	void stop() {
		System.out.println(model+"("+color+") has stopped.");
	}
}
public class CarAttri {
	public static void main(String[] args) {
		Car c1=new Car("Tesla Model 3","Red");
		c1.start();
		c1.stop();
		Car c2=new Car();
		c2.start();
		Car c3=new Car("Honda Civic","Blue");
		c3.start();
		Car c4=new Car("BMW X5","Black");
		Car c5=new Car("Audi A4","White");
		c4.start();
		c5.start();
		Car c6=new Car("Maruti Swift","Grey");
		c6.start();
		Car c7=new Car("Hyundai Creta","Silver");
		c7.stop();
		Car c8=new Car("Kia Seltos","Red");
		c8.color="Blue";
		c8.start();
		Car c9=new Car("","");
		c9.start();
		c9.start();
		c9.stop();
		c9.start();
	}
}
 