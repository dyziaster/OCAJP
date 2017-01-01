package Test1;

import org.omg.Messaging.SyncScopeHelper;

interface Drivable{
	
	public abstract void Drive();
	
}

public class Main implements Drivable{
	public Main(int x){

		System.out.println("noarg main");
		return;
	}
	String s = "123";
	final int x = 500;
	{System.out.println(x);}
	
	public void asd(){
		
		short b = x;
		
		
	}
	
	public static void main(String  [     ]  args) {
		  
		String s = null;
		new Main2();
		
		System.out.println(s+"asd");
		
		Main2 main2 = new Main2();
		
		main2.chuj(()-> System.out.println("asd"));
		
	}

	@Override
	public void Drive() {

		System.out.println("driving");
		
	}

}

class Main2 extends Main{
	
	
	public Main2(){
		this(1,32);
		System.out.println("noarg main2");
	}
	
	public Main2(int x,int y){
		this(x,y,2);
		System.out.println("arg main2");
	}
	public Main2(int x,int y, int z){
		super(2);
		System.out.println("argxyz main2");
	}
	
	public void chuj(Drivable d){
		d.Drive();
	}
	
	
}


