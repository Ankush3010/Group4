public class staticAndNonStatic  extends staticAndNonStaticP{
	//Static Method in Same Class

	public static void display() {
		System.out.println("This is Static Method ");
	}
	
	//Static with parameter same class

	public static void sum(int a, int b) {
		int add = a + b;
		System.out.println("This is Static Method with Parameter  from same Class");
		System.out.println("Addtion = " + add);

	}
	//Static with Return type with parameter same class

	public static int sub(int a ,int b){
		System.out.println("This is Static Method with Parameter with Return  from same Class");

		return a - b;
	}
	//Non-static
	public void display2(){
		System.out.println("This is Non-Static Method");
	}
	// Non-Static with parameter same class
	public void  div(int a , int b){
		int c = a / b;
		System.out.println("This is Non-Static Method with Parameter  from same Class");

		System.out.println("Division = " + c);
	}
	//Non-Static with Return type with parameter same class
	public int mul(int a , int b){
		System.out.println("This is Non-Static Method with Parameter with Return  from same Class");

		return a*b;
	}
	

	public static void main(String[] args) {
		//Result of Static Method in Same Class
		display();
		System.out.println("***********************************************");
		
		//Result of Static with parameter same class
		sum(10, 55);
		System.out.println("***********************************************");
		
		//Result of Static with Return type with parameter same class
		int result=sub(65,32);
		System.out.println("Subtraction = " + result);
		System.out.println("***********************************************");
		
		//Result of Non-static
		staticAndNonStatic s = new staticAndNonStatic();
		s.display2();
		System.out.println("***********************************************");
		
		// Result of Non-Static with parameter same class
        //staticAndNonStatic d = new staticAndNonStatic();
		s.div(36, 4);
		System.out.println("***********************************************");
		
		// result of Non-Static with Return type with parameter same class
		//staticAndNonStatic m= new staticAndNonStatic();
		int cal= s.mul(33, 5);
		System.out.println("Multiplication = " + cal);
		System.out.println("***********************************************");
		
		//Result of Static Method in Different Class
		screen();
		System.out.println("***********************************************");
		
		//Result of Static with parameter same class
		decimalSum(34.45, 67.23);
		System.out.println("***********************************************");
		
		//result of Static with Return type with parameter Diff class
		double deciSub=decimalSub(66.44, 12.67);
		System.out.println("Subtraction = " + deciSub);
		System.out.println("***********************************************");
		
		//Result of Non-Static Method in Different Class
		s.screen2();
		System.out.println("***********************************************");
		
		//Result of Non-Static with parameter Different class
		s.decimalMul(34.1,0.2);
		System.out.println("***********************************************");
		
		//result of Non-Static with Return type with parameter Different class
		double deciDiv = s.decimalDiv(22.44,11);
		System.out.println("Division = " + deciDiv);
		System.out.println("***********************************************");



	}

}
