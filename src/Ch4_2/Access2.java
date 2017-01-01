package Ch4_2;
import Ch4.Access;

public class Access2 extends Access{
	
	
	public void a1(){
		
		get();
		System.out.println(x);
		get2();
		Access.get2();
		
		
	}
	
	public void a2(){
		
		Access2 a = new Access2();
		Access.get2();
		a.x = 2;
		
		a.get();
		a.get2();
		
	}
	
	
	public void a3(){
		
		Access a = new Access();
		a.get2();
		Access.get2();
		//a.get();
		//a.x;
		
	}

}

class Access3 extends Access{
	
	public void a1(){
		
		Access3 a = new Access3();
		a.get();
		a.get2();
		Access2 a2 = new Access2();
		//a2.get();
		a2.get2();
		Access.get2();
	}
	
}

class Access4{
	
	public void a(){
		//Access.get(); no compile
		Access a = new Access();
		//a.get2(); no compile
	}
	
	final public void mac(){
		
	}
	
	public static final void asd(){
		
	}
}