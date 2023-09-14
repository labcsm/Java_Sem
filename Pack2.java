package p2;
import p1.*;

class Derived extends Pack1
{
    void method2()
    {
        System.out.println("Bye");
    }
}
public class Pack2
{
	public static void main(String[] args) {
		Derived a=new Derived();
		a.method1();
		a.method2();
	}
}
