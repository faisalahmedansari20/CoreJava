class Widening
{
	public static void mk(Integer I)
	{
		System.out.println("Autoboxing");
	}
	public static void mk(int l)
	{
		System.out.println("Widening");
	}

	public static void main(String[] args)
	{
		int x=10;
		mk(x);
	}

}