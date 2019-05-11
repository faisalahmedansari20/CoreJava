class TestMultithreading
{
	public static void main(String[] args)
	{
		m1();
	System.out.println(10/0);
	}
	public static void m1()
	{
		m2();
       System.out.println("in the m1");
	}
	public static void m2()
	{
		m3();
		System.out.println("in the m2");
	}
	public static void m3()
	{
		System.out.println("hi how are you");
	}
}
