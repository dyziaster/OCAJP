package Test1;

public class AA {
	int c = 4;

	public static void main(String[] args) {

		AA aa = new AA();
		System.out.println(aa.c);
		BB bb = new BB();
		System.out.println(bb.c);
	}
}

class BB extends AA {

}
