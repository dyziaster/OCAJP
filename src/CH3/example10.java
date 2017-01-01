package CH3;

public class example10 {

	public static void main(String[] args) {
		
		String a = "";
		String b = "a"; // comes from string pool
		a+= "a"; // comes from building operations
		
		if(a==b)
			System.out.println("=="); // references are different
		else if(a.equals(b))
			System.out.println("equals");
		
	}

}
