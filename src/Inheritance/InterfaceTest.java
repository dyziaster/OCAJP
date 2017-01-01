package Inheritance;

abstract interface I1{
	
	default String s(){
		return "asd";
	}
	
	public default int temp(){
		return 5;
	}
	
}

interface I2 extends I1{
	
	default int temp(){
		return 6;
	}
	
}

abstract class abs implements I1,I2{


	
	
	
}

public class InterfaceTest implements I1,I2{
	
	public int temp(){
		return 2;
	}
		static final int x;
		final int y;
		
		{
			y =3;
		}
		static{
			x= 2;
		}

}
