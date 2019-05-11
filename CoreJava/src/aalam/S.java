class S
{

{
	public static void m()
	{
		int a=12;
		int b=24;
		System.out.println(++a + a++);
		System.out.println(a + a++);
		System.out.println(b + ++b);
		System.out.println(b++ + b);
	}
	public static void main(String... args)
	{S.m();
	}
}