
public class defaultConstC  extends defaultConstP{

	public static void main(String[] args) {

		defaultConstP x = new defaultConstP();
		x.display();
		System.out.println("********");
		defaultConstP y = new defaultConstP(44);
		y.display();
		System.out.println("********");

		defaultConstP z = new defaultConstP(33,68);
		z.display();
		
		defaultConstC v = new defaultConstC();
		v.display();
		
//		defaultConstC w = new defaultConstC(11);
//		w.display();
	}

}
