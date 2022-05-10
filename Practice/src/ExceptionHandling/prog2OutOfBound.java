package ExceptionHandling;

public class prog2OutOfBound {

	public static void main(String[] args) {

		int[] num ={1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<=10; i++)
		{
			try
			{
				System.out.println(num[i]);
			}
			catch(Exception e)
			{
				System.out.println("Exception = " +e);
			}
		}
	}

}
