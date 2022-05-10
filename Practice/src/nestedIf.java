
public class nestedIf {

	public static void main(String[] args) {
		String username="abmc";
		String password = "xxxx";
		
		if(username=="abc")
		{
			if (password=="xxxx")
				{
				System.out.println("successful login");
				}
			else
			{
				System.out.println("wrong password");
			}
		}
		else
		{
			System.out.println("wrong username");
		}
	}

}
