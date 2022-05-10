public class primeNumber {

	public static void main(String[] args) {

		int a = 89, temp = 0;
		

		if (a > 1) 
		{
			for (int i = 2; i < a; i++)
            {
				if (a % i == 0) 
				{
					temp = temp + 1;
				}
			}
			if (temp > 0) 
			{
				System.out.println("Not a Prime number");
			}
			else
				{
				System.out.println("Prime number");
				}
		}

		else {
			System.out.println("Not a Prime number");
		}
	}

}
