package group4;

public class Factorial {
	
public static void main(String[] args) {
		
		//5!
		
		int num = 5;
		int fact = 1 ;
		for(int i=num; i>0; i--)
		{
			fact = fact * i;
		}
		
//		for(int i=1; i<=num; i++)
//		{
//			fact = fact*i;
//		}
		
		System.out.println("factorial of no is = " + fact);
	}


}
