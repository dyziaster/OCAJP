package Chapter1;

public class ZZZ
{
    int i = 42;
    {
        System.out.println("Instance init:" + i);
        i++;
    }
     
    ZZZ() {
        System.out.println("ZZZ(): " + i);
    }
     
    public static void main(String[] args) {
        new ZZZ();
    }  
}