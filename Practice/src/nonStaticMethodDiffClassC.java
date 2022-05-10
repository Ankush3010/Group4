
public class nonStaticMethodDiffClassC extends nonStaticMethodDiffClassP {
	
	public void display (){
		System.out.println("This is a Display Method");
	}

	public static void main(String[] args) {
		
		nonStaticMethodDiffClassC abc = new nonStaticMethodDiffClassC();
		abc.display();
		abc.mul();

	}

}
