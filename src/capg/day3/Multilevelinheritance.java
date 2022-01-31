package capg.day3;

class X{
	public void printX1() {
		System.out.println("This is class X");
	}
}
class Y extends X{
	public void printY1() {
		System.out.println("This is class Y");
	}
}
class C extends Y{
	public void printC() {
		System.out.println("This is class C");
	}
}
class D extends C{
	public void printD() {
		System.out.println("This is class D");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		D d1 = new D();
		d1.printX1();
		d1.printY1();
		d1.printC();
		d1.printD();

	}

}
