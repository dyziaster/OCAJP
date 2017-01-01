package Test1;

public class OverloadingTest {
	
	
	
	public void met(int a){
		
	}
	
	//private static int met(int a){	} not compiles
	//must have different parameter list <-----------------------------------
	
	public void met(int a, int b){}
	
	public void met(int a, Integer b){}
	public void met(Integer a, int b){}
	
	//public void met(Integer b, int a){}
	
	private void met(int a, String b){}

	protected void met(int a, String b,int c) throws Exception{}
	protected void met(int a, String b,int c, Integer d) throws RuntimeException{}
	//protected void met(int a, String b,int c, Integer d) throws Exception{}
	
	public void met(int[] l){} // need to pass a reference to array
	//public void met(int... l){} need to pass (1,2,3) or sth like that...
	//it treats as array, so its same parameter list and does not compile

}
