package Test1;

public class AnimalsCats {

	public static void main(String[] args) {

		// I create a Animal object named genericAnimal

		Animal genericAnimal = new Animal();
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);

		// I create a Cat class like any other
		Cat morris = new Cat("Morris", "Tuna", "Rubber Mouse");

		// Print out the name, favFood and favToy
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);

		// You can also create classes based on the super class

		Animal tabby = new Cat("Tabby", "Salmon", "Ball");

		// You pass objects like any other field
		acceptAnimal(tabby);

	}

	public static void acceptAnimal(Animal randAnimal) {

		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		randAnimal.walkAround();

		Cat tempCat = (Cat) randAnimal;

		System.out.println(tempCat.favToy);

		System.out.println(((Cat) randAnimal).favToy);

		if (randAnimal instanceof Cat) {
			System.out.println(randAnimal.getName() + " is a Cat");
		}

	}

}
