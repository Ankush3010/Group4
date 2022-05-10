package ExceptionHandling;

public class prog1OutOfBound {

	public static void main(String[] args) {

		String[] s1= new String[5];
		s1[0]="ABC";
		s1[1]="EFG";
		s1[2]="HIJ";
		s1[3]="KLM";
		s1[4]="NOP";
		try
		{
			s1[5]="QRS";
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Exception = " +e);
		}
		
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		System.out.println(s1[3]);
		System.out.println(s1[4]);
		try
		{
			System.out.println(s1[5]);
		}
		catch(Exception e)
		{
			System.out.println("Exception = " +e);
		}
		
		
	}

}
