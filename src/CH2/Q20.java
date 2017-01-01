package CH2;

public class Q20 {
	

	
	public static void main(String[] args) {
		
		final char a = 'A'; // only this is valid
		char d = 'D';
		char grade = 'B';
		final char f;
		f = 'f';
		
		switch(grade){
		
		case a:
		case 'B': System.out.println("B");
		case 'C':System.out.println("C");
		case d:System.out.println("d"); // must be constant in compile time 
		case f:// must be constant in compile time
			
		
		
		
		}
		
		
	}
	
	private void caseConstantTypes(){ // ints shorts bytes chars are interchangable
									// there can be ints or type that can be automaticly cast to int (byte,short,char)
		
		int x = 0;
		char c = 'c';
		short s = 3;
		byte b = 4;
		double d = 4.00;
		long l = 1;
		
		String str = "asd";
		
		switch(b){
		
		case 1:
			break;
		case (short)2:
			break;
		case '3':
			break;
		
		
		
		}
		
	}
	
}
