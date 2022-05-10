
public class staticCallingTwoMethodUsingIfElse {
	static int a,b; 
	public static void abc()
	{
		int c=a+b;
		System.out.println("This will print if first condtion satisfies" + c);
	}
	public static void def()
	{
		int d=a-b;
		System.out.println("This will print if second condotion satisfies" + d);
	}

	public static void main(String[] args) {
		
		a=4;b=9;
		if(a>=b){
			abc();
		}
		else
		{
			def();
		}
	
		

	}

}
