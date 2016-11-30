package Test1;

interface Flyer {
	String getName();
}

class Bird implements Flyer {	



	String surname = "birdsurname";
	
	public String name;
	
	public Bird(){
		name="default";
	}

	public Bird(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Eagle extends Bird {
	
	public Eagle(String name) {
		super(name);
		this.name="asd";
	}
	public String getName() {
		return name;
	}
}

public class Inherit1 {
	public static void main(String[] args) throws Exception {
		Flyer f = new Eagle("American Bald Eagle");// PRINT NAME HERE    } }
		Eagle e = new Eagle("xyz");
		
		System.out.println(e.getName());
		System.out.println(e.surname);
	}
}
