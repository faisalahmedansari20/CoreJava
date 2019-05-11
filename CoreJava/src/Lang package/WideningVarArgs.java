class WideningVarArgs
{
	public static void mk(long l)
	{
		System.out.println("widening");
	}
	public static void mk(int... i)
	{
		System.out.println("var args");
	}

	public static void main(String[] args)
	{
		int x=10;
		mk(x);
	}
}