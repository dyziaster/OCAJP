package Test1;

/*
 * 
 * without creating object , only static blocks and vars are initialized.
 * if there is super class initialize it first
 * if making a new obj, first go static then member init, and last goes constructor
 * 
 * 
 * 
 * 
 */
class SuperOrder{
	
String name2 = "name2";
	
	{System.out.println(name2);}
	
	static int c = 22;
	
	static {System.out.println(c);}

	{c++ ; System.out.println(c);}
	
	public SuperOrder(){
		System.out.println("constr2");
	}
	
	
}

public class InitOrder extends SuperOrder{
	
	String name = "name";
	
	{System.out.println(name);}
	
	static int c = 1;
	
	static {System.out.println(c);}

	{c++ ; System.out.println(c);}
	
	public InitOrder(){
		System.out.println("constr");
	}
	
	public static void main(String[] args) {
		
		System.out.println("read to constr");
		new InitOrder();
		System.out.println(InitOrder.c);
		
	}// when no obj is created, only statics are initialized and run. the instance initializers and constr are not run
}
