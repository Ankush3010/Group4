package logicalPractice;

public class starProg6 {

	public static void main(String[] args) {

		int star=5;
		for(int row=1;row<=5;row++)
		{
			 for(int i=1;i<=star;i++)
			 {	 
				 if(row==2 && (i==3 ))
				 {
					 System.out.print(" ");
					 continue;
				 }
			 else if(row==3 && (i==2 || i==3 || i==4))
				 {
					 System.out.print(" ");
					 continue;
				 }
			 else if(row==4 && i==3)
			 {
				 System.out.print(" ");
				 continue;
			 }		
					 System.out.print("*");				
			 }
			 System.out.println();	
					
		}
	}

}
