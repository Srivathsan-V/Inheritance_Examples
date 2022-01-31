package capg.day3;

class A{
	public int a = 10;
	public static void printA() {
		System.out.println("Iam Class A");
	}
}
class B extends A{
	public int b =20;
	public static void printB() {
		System.out.println("Iam Class B");
	}
}
public class Myinheritance {

	public static void main(String[] args) {
		B b = new B();
		B.printA();
		B.printB();
		System.out.println("B belongs to A class " + b.a);
		System.out.println("B belongs to B class "+ b.b);
		

	}

}
