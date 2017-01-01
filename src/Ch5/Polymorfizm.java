package Ch5;

class Thing {

	public static String getName() {

		return "thing";

	}

	public void description() {

		System.out.println("description " + getName());

	}

}

class Animal extends Thing {

	public static String getName() {

		return "animal";

	}
	
	public void description() {

		System.out.println("description " + getName());

	}

}

class Tiger extends Animal {

	public static String getName() {

		return "Tiger";

	}
	
	public void description() {

		System.out.println("description " + getName());

	}

}

public class Polymorfizm {
	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.description();/*
							 * Tiger t = (Tiger)a1; // cannot be cast . runtime
							 * error t.description();
							 */
		Tiger t = new Tiger();
		t.description();
		Animal a2 = (Animal) t;
		a2.description();
		Animal a = new Tiger();
		a.description();

	}
}
