package capg.day3;

abstract class laptop{
	final int price = 100000;
	abstract public void screenresolution();
	abstract public void graphicscard();
	abstract public void processor();
	
	public void charging() {
		System.out.println("Charging");
	}
}

class dell extends laptop{
	
	@Override
	public void screenresolution() {
		System.out.println("The resolution of dell laptop is 4K");
		
	}
	@Override
	public void processor() {
		System.out.println("The Processor is intel core i9 10th gen");
	}
	
	public void dellwindows() {
			System.out.println("This laptop is installed with windows11 operating system");
		}
	public void graphicscard() {
		System.out.println("This laptop comes with RTX2060");
	}
	}
class rog extends laptop{
	@Override
	public void screenresolution() {
		System.out.println("The resolution of dell laptop is 4K");
		
	}
	@Override
	public void processor() {
		System.out.println("The Processor is intel core i9 10th gen");
	}
	@Override
	public void graphicscard() {
		System.out.println("This laptop comes with RTX2080");
	}
	public void rogwindows() {
		System.out.println("This laptop is installed with windows11 operating system");

	}
}

public class Abstraction {
	

	public static void main(String[] args) {
		dell g5 = new dell();
		g5.dellwindows();
		g5.screenresolution();
		g5.processor();
		g5.graphicscard();
		g5.charging();
		
		rog r1 = new rog();
		r1.rogwindows();
		r1.screenresolution();
		r1.processor();
		r1.graphicscard();
		r1.charging();
		

	}
}



