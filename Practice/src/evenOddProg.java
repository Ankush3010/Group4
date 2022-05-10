import java.util.Scanner;


public class evenOddProg {

	public static void main(String[] args) {
		
		int num ;
		System.out.print("Number = ");
		Scanner a = new Scanner(System.in);
		
		num= a.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println(num + " is an Even Number");
		}
		else
		{
			System.out.println(num + " is an Odd Number");
		}
	}

}
