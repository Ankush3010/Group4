package ExceptionHandling;

public class prog4NullPointer {

	public static void main(String[] args) {

		String s2 = "";
		System.out.println(s2);
		
		String s = null;
		System.out.println(s.length());
		
		
		String s1 = "1000";
		int num = Integer.parseInt(s1);
		System.out.println(num);
	}

}
