package Test1;

public class ConstructorTest {
	// this() must be first uncomented statement used
	
	public ConstructorTest(){
		this(1,2); // can call any contructor from any constructor
	}
	
	ConstructorTest(int a){
		this(a,1,2);
	}
	
	protected ConstructorTest(int a,int b){
		this(a);
	}
	
	private  ConstructorTest(int a,int b, int c){
		
		
	}

	//recoursive constructor no compiles - creates loop creating objetcs in infinity.
	// constructor chaining - least parameters constr. calls most parameter constr. and so on.
}
