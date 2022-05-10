
public class ForLoopBreakAndContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<=20; i++)
		{	
//		System.out.println(i);
//		if(i==3)
//		{
//			break;
//		}
			if(i==10 && i<15)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}

