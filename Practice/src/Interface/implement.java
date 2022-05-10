package Interface;

public class implement implements interface1, interface2 {

	@Override
	public void bicycle() {
		System.out.println("Price of a Bicycle is " + price2);

	}

	@Override
	public void car() {
		System.out.println("Price of a car is " + price1);
	}

}

class implementation {
	public static void main(String[] args) {
		implement s = new implement();
		s.bicycle();
		s.car();
		s.car1();

	}
}