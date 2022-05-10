package SuperAndThisKeyword;

public class ThisProg {
	int a = 100;
	public ThisProg(int a)
	{
		a=200;
		this.a=a;
		//a = this.a;
		System.out.println("A = " + a );
	}

	public static void main(String[] args) {

		ThisProg o = new ThisProg(11);
		
	}

}
