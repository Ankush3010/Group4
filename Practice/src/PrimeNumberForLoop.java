
public class PrimeNumberForLoop {

	public static void main(String[] args) {
;
		for(int i=2; i<=50; i++)
		{
			int temp=0;
			for( int j=2 ; j<=i-1 ; j++)    
			{
				if(i%j==0)
				{
				  temp=temp+1;
			    }
				
				if(temp==1)
				{
					break;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
			
		}

	}

}
