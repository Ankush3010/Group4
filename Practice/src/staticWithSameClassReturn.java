
public class staticWithSameClassReturn {
	
	public static int abc()
	{ 
		int a;
		return a=20 + 30;
		
	}

	public static void main(String[] args) {
		int c = abc();
		System.out.println("Addition = " + c);


	}

}
