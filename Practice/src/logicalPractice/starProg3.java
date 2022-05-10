package logicalPractice;

public class starProg3 {

	public static void main(String[] args) {
		int star=1,space=4;
		
		for(int row=1;row<=9;row++)
		{
			int a=1;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=star;i++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
			if(row<=4)
			{
			star=star+2;
			space--;
			}
			else
				{
				star=star-2;
				space++;
				}
			}
//		int star1=7,space1=1;
//		for(int row1=1;row1<=5;row1++)
//		{
//			int b=1;
//			for(int i=1;i<=space1;i++)
//			{
//			    System.out.print(" ");
//			}
//			for(int j=1;j<=star1;j++)
//			{
//				System.out.print(b);
//				b++;
//			}
//			System.out.println();
//			star1=star1-2;
//			space1++;
//			
//		}
	}

}
