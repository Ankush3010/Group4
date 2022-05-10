
public class returnTypeIfElse {
	
	public static boolean xyz(int a, int b){
		if (a>=b)
		{
			return true;
		}
		else{
		return false;
		}
	}

	public static void main(String[] args) {
		
		boolean z= xyz(1000,300 );
		System.out.println("the steatment is " + z);
	}

}
