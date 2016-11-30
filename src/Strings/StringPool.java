package Strings;

public class StringPool {
	
	
	/*
	 * String class itself is final and so all of its methods are implicitly final.
	 * It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
	 * 
	 */
	
	public static void pool(){
		
		String qwe = "qwe";
		String rty = "rty";

		String qwerty = "qwerty";
		String qwerty2 = qwe+rty;
		String qwerty3 = "qwe"+"rty";
		String qwerty4 = "qwe".concat("rty");
		String qwerty5 = "qwe".concat("rty").intern();
		
		System.out.println(qwerty==qwerty2);
		System.out.println(qwerty==qwerty3);
		System.out.println(qwerty==qwerty4);
		System.out.println(qwerty==qwerty5);

		System.out.println(qwerty=="qwe"+"rty");
		System.out.println(qwerty=="qwe".concat("rty"));
		
		String a = "";
		a+="a";
		String b = "a";
		String c = ""+"a";
		final String d = "";
		final String e = "a";
		String f = d+e;
		System.out.println("abc=========");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(c==b);
		System.out.println(c==f);
		System.out.println(b==f);
		
		StringPool sp = new StringPool();
		StringPoolChild spc = new StringPoolChild();
		
		if(sp==spc){ // works
			
		}
	}
	
	public static void main(String[] args) {
		
		pool();
		
		
	}

}

class StringPoolChild extends StringPool{
	
}
