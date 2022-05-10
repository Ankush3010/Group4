
public class memoryMangment {
	
	int a;
	static int b;
	public void display(){
		a=20;
		b=30;
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) {
		memoryMangment c = new memoryMangment();
		c.display();
	
	}

}
