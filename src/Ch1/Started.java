package Ch1;

public class Started {

	
	public static void main(String args[]){
		
		System.out.println("kurwa chuuuuj");
		
		Newclass class1 = new Newclass();
		
		System.out.println(class1);
	}
}

class Newclass{
	
	private int age;
	
	public Newclass(){
		age = 21;  
		
	}
	public String toString(){
		return String.format("%d"+"kurwachuj", age);
	}
}

class Class2 extends Newclass{
	private int height = 0;
	
	public Class2(){
		super();
		height = 111;
		
	}
}