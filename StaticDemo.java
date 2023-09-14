//Program to demonstrate Static variables, methods, Block

class StaticTest
{
	static int a;
	static void dispA()
	{
		System.out.println("Value of a : "+a);
	}
  static
	{
		System.out.println("This is static block executed first setting a value to 10");
		a=10;
	}

}

class StaticDemo
{
	public static void main(String args[]) 
	{
		StaticTest.dispA();
		StaticTest.a=11;
		StaticTest.dispA();
	}
}
