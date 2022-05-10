package Interface;

public class prog3Implement implements prog3interface3 {
	@Override
	public void method1() {
	System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println("method2");		
	}

	@Override
	public void method3() {
		System.out.println("method3");		
	}
	
	public static void main(String[] args) {
		
		prog3Implement a = new prog3Implement();
		a.method1();
		a.method2();
		a.method3();
		//prog3Interface1.method4();
		a.method4();
	}
}
