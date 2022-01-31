package capg.day3;

class parent{
	public void printparent() {
		System.out.println("This is parent class");
	}

}
class c1 extends parent{
	public void printc1() {
		System.out.println("This is child1 class ");
	}
	
}
class c2 extends parent{
	public void printc2() {
		System.out.println("This is child2 class");
	}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		c1 child1 = new c1();
		child1.printc1();
		child1.printparent();
		
		c2 child2 = new c2();
		child2.printc2();
		child2.printparent();

	}

}
