package Test1;
public class FinalTest {

	public static final int x;
	
	public FinalTest(){
		//x=4;
		
		
		
	}
	
	
	public static void main(String asdp[]){
		x =3;
	}
}

class FinalTest2 {

	public final int x;
	
	public FinalTest2(){
		x=4;
		
	}
	
}

class FinalTest3 {

	public final int x=2;
	
	public FinalTest3(){
		
	}
	
}

// all final member var must be initialized before constructor completes.