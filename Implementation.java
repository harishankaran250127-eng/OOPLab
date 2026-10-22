package Exp6;

interface Animal1{
	void makeSound();
}
class Dog1 implements Animal1{
	public void makeSound() {
		System.out.println("Dog says:Bark");
	}
}
class Cat1 implements Animal1{
	public void makeSound() {
		System.out.println("Cat says:Meow");
	}
}
public class Implementation {
	public static void main(String[] args) {
		Dog1 d=new Dog1();
		Cat1 c=new Cat1();
		d.makeSound();
		c.makeSound();
	}

}
