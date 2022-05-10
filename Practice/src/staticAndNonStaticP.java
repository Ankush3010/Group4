
public class staticAndNonStaticP {
	
	//Static Method in Different Class
	public static void screen()
	{
		System.out.println("This is the Static Method in Different  Class");
	}
	
	//Static with parameter same class
	public static void decimalSum( double a , double b){
		System.out.println("This is Static Method with Parameter  from Different Class");
		double v ;
		v = a + b;
		System.out.println("Addition = " + v);
	}
	//Static with Return type with parameter Diff class
	
	public static double decimalSub(double a , double b){
		System.out.println("This is Non-Static Method with Parameter with Return  from same Class");
		return a-b;

	}
	
	//Non-Static Method in Different Class
	public void screen2(){
		System.out.println("This is the Non-Static Method in Different  Class");

	}
	//Non-Static with parameter Different class
	
	public void decimalMul(double a, double b)
	{
		System.out.println("This is Non-Static Method with Parameter  from same Class");
		double c = a*b;
		System.out.println("Multiplication = " + c);
	}
	//Non-Static with Return type with parameter Different class
	
	public double decimalDiv(double a, double b){
		System.out.println("This is Non-Static with Return type with parameter from Different class");

		return a/b;
	}




}
