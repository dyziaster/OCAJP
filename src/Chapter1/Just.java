package Chapter1;

public class Just {
	int a = 10;

	Just() {
		System.out.println("constructor just");
		call();
	}

	void call() {
		System.out.print("a = " + a + " ");
		System.out.println("call from just");
	}
	
	public static void main(String args[]) {
		new Q05();
	}
}

class Q05 extends Just {
	int b = 16;

	Q05() {
		System.out.println("constructor q05");
		call();
	}

	void call() {
		System.out.println("call from q");
		System.out.print(" b = " + b + " ");
	}


}