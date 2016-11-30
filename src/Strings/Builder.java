package Strings;

public class Builder {
	
	public static void stringBuilderBuffer(){
		
		StringBuilder s = new StringBuilder("ala ma kota a kot ma ala"); // String as param or charseq - CharBuffer, Segment, String, StringBuffer, StringBuilder
		StringBuilder s1 = new StringBuilder(123); // int capacity
		StringBuilder s2 = new StringBuilder(); // empty
		
		
		/*
		 * append - takes almost all objects as param
		 * capacity() - returns capacity
		 * charAt(int index)
		 * delete(int start,int end)
		 * deleteCharAt(int index)
		 * ensureCapacity(int minimum) Ensures that the capacity is at least equal to the specified minimum.
		 * indexOf(String str)
		 * indexOf(String str, int from)
		 * insert() - takes almost all objects
		 * lastIndexOf(String str)
		 * length()
		 * replace(int start,int end, String str)
		 * reverse() -- String class does not have it
		 * substring(int start)  RETURNS STRING does not change StringBuilder!!!!!!!!!!!
		 * substring(int start,int end) RETURNS STRING
		 * toString() RETURNS STRING
		 * trimToSize() reduce storage 
		 */
		
		s.substring(5);
		System.out.println(s);
		s.substring(6,10);
		System.out.println(s);
		System.out.println(s.substring(5));
		System.out.println(s.indexOf("ala")); // case sensitive
		System.out.println(s.indexOf("ala",10));
		s.replace(0, 3, "ola"); // zerobased, onebased
		System.out.println(s);
		s.trimToSize();
		
	}
	
	
	public static void main(String[] args) {
		
		
		stringBuilderBuffer();
		
		
		
		
		
		/*
		Integer i = 5;
		
		double b = 4;
		
		System.out.println(i+b);
		
		Long l = new Long(2);
		Short s = new Short((short) 3);
		Byte c = new Byte((byte) 4);
		Integer x = new Integer(3);
		
		if(3==x){
			
		}
		*/
		
		
		
	}

}
