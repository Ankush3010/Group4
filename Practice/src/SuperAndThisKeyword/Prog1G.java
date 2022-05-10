package SuperAndThisKeyword;

public class Prog1G {
	int a = 90;
//	public Prog1G()
//	{  
//		this(100);
//		//this("Ankush");
//		//System.out.println("A = " +a);
//		System.out.println("This is a Default Constructor");
//	}
	
	public Prog1G(int a)
	{	
		this("Ankush");
		System.out.println("A = " + a);
	}
	
	public Prog1G(String b)
	{
	//	this(10,20);
		//this(100);
		System.out.println("My name is " + b);
	}
	public Prog1G(int b , int c)
	{
		this(200);
		System.out.println("B = " + b + " C = " +c);
	}
//	public void display()
//	{
//		Prog1G z = new Prog1G(20,30);
//	}

}
