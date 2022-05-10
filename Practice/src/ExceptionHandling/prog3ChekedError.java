package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class prog3ChekedError {

	public static void main(String[] args) {
		System.out.println("Start of main Method");
		try {
			FileInputStream file = new FileInputStream("D:/abc.text");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("End of main Method");
	}

}
