
public class arrayOf5AndTheirSum {

	public static void main(String[] args) {
		
		int [] num = {22,33,44,55,66,77};
		int sum=0;
		
		for ( int i = 0 ; i< num.length ; i++)
		{
			
			sum = num[i] + sum ;
		}
		
		System.out.println(sum);

	}

}
