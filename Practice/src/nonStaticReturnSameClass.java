
public class nonStaticReturnSameClass {
public int add()
{
	return 25+44;
}
	public static void main(String[] args) {
		nonStaticReturnSameClass abc= new nonStaticReturnSameClass();
		int a=abc.add();
		System.out.println("output" + a);

	}

}
