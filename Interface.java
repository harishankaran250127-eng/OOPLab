package Exp6;

interface Animal{
	void makesound() ;
}
class Interface implements Animal {
	public void makesound() {
		System.out.println("Dog says:Bark");
	}
	public static void main(String[] args) {
		Interface d=new Interface();
		d.makesound();
	}
}
