package Test1;

interface Drivablee{
	
	public void drive(int a);
}


class Car1{

	public void go(Drivablee d){
		System.out.println("driving");
		d.drive(5);
	}
	
	
	
	
}

public class Lambda {

	
	
	public static void main(String[] args) {
		
		
		Car1 c = new Car1();
		
		
		c.go( x ->{System.out.println("im dribing"+ x); });
		
		
	}
}
