package logicalPractice;

public class starProg5 {

	public static void main(String[] args) {

		
		for(int i=1;i<=18;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int j=1;j<=9;j++)
		{
			if(j==1)
			{
				System.out.print(" ");
				continue;
			}
			System.out.print("*");
		}
		System.out.println();
		for(int k=1; k<=9;k++)
		{
			if(k==1|| k==2||k==4||k==5||k==6||k==8||k==9)
			{
				System.out.print(" ");
				continue;
			}
			System.out.print("*");
		}
	}
	
}
