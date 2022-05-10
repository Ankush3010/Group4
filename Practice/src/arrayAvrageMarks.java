
public class arrayAvrageMarks {

	public static void main(String[] args) {
		
		int[] marks = {37,45,66,67,99};
		double sum = 0;
		double avg ;
		//System.out.println(marks [5]);
		//System.out.println(marks.length);
		for(int i = 0 ; i < marks.length ; i++)
	{
		  sum = sum + marks[i] ;	//37+45+66+67+99=xyz
		}
		
		avg = sum/marks.length ;
		
		System.out.println(avg);	
		
	}

}
