package Test1;

class A {
	{print();}
	A() {
		print();
	}

	private void print() {
		System.out.println("A");
	}

	public static void main(String[] args) {
		A a = new C();
		a.print();
		System.out.println("------------------");
		A b = new B();
		b.print();
		System.out.println("------------------");
		C c = new C();
		c.print();
	}

}

class B extends A {
	int i = 4;

	void print() {
		System.out.println(i + "inB");
	}

}

class C extends B {


	int i = 5;

	C() {

		System.out.println("in C constr");
		super.print();
		System.out.println("in C constr");
	}

	void print() {
		System.out.println(i + "inC");
	}

}