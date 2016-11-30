package Test1;




public class TestClass{
   public static void main(String args[ ] ){
      Z o1 = new V( );
      X o2 = (X) o1;
      Z o3 = new X();
      System.out.print(o1.m1( ) +" " );
      System.out.print(o2.i +" ");
      System.out.print(o3.m1( ) +" " );
      
      double d = 1234.5678;
      int x = (int)d;
      System.out.println(x +" "+d);
      System.out.println(d-x);
   }
}
class Z { int i = 10;  int m1( ) { return i; } }
class X extends Z { int i = 20;   }
class V extends X { int i = 30;  int m1() { return i; } }
