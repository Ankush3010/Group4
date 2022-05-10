
public class leapYearProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2020;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.println(year + " is a Leap year");
		}
		else
		{
			System.out.println(year + " is Not a Leap year");
		}
		
//		int year = 5000;
//		
//		if(year % 4 ==0)
//		{
//			if(year % 100 !=0 || year % 400 == 0)
//			{
//				System.out.println(year + " is a Leap year");
//			}
//			else
//			{
//				System.out.println(year + " is not a Leap year");
//			}
//				
//		}
//		else
//		{
//			System.out.println(year + " not a leap year");
//		}
		
	}

}
