import java.util.Scanner;


public class monthsProgram {

	public static void main(String[] args) {
		
	int month ;
	System.out.print("Days in Month = ");
	Scanner a = new Scanner(System.in);
	month = a.nextInt();
	
	switch (month){
	case 30:
		System.out.println("April"+" June"+ " September"+" November");
		break;
	case 31:
		System.out.println("January"+ " March" +" May" +" July"+ " August"+ " October"+ " December");
		break;
	case 28|29:
        System.out.println("February");
        break;
	}


	}

}
