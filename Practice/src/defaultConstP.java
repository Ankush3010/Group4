
public class defaultConstP  {
	
	int a,b;
	public defaultConstP()
	{
		a=10;
		b=98;
	}
	public defaultConstP(int c)
	{
		b=c;
	}
	public defaultConstP(int x , int y)
	{
		a = x;
		b = y;
	}
public void display()
{
	System.out.println("value of A = " + a);
	System.out.println("value of B = " + b);
}
}
