package Ch4;
import static java.util.Arrays.asList;


public class Static {
	
	public void asList(){
		
	}
	
	void ass(){
		
		asList();
		Arrays.asList("one");
		
	}
	static void asd(){
		
		System.out.println("inasd");
	}
	
	
	static int x = 4;
	
	static void asd2(){
		
		Static staic = new Static();
		
		staic.asd();
		
		new Static().asd();
		
		
		staic =null;
		
		staic.asd();
		
	}
	
	public static void main(String[] args) {
		asd2();
	}

}
