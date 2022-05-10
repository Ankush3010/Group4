package SuperAndThisKeyword;

public class LocalVariable {
	static int a;
	public void display()
	{
		//int a;
		System.out.println(a);
	}
	public static void display(int a )
	{
		
	}
	

	public static void main(String[] args) {
	//	display();

		LocalVariable x = new LocalVariable();
		x.display();
	}

}
