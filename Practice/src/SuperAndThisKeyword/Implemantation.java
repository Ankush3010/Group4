package SuperAndThisKeyword;

 abstract class Implemantation {
	
	int a = 10;
	abstract public void display();
	
}
 class AbstractIntanceVariableC extends Implemantation {
public void display()
{
	System.out.println(a);
}
 }
 class Implemantation1 {
public static void main(String [] args)
{
AbstractIntanceVariableC x = new AbstractIntanceVariableC();
x.display();
}
}
