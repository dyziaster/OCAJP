package Chapter1;

public class Uber {
    static int y = 2;
    Uber(int y) {
    	this();
    	y = y * 2; 
    	} //difference is here
    Uber() { y++; }
}
class Minor extends Uber {
    Minor() { super(y); y = y + 3; }
    public static void main(String [] args) {
        new Minor();
        System.out.println(y);
    } 
    }	
