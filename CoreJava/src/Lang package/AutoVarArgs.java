class AutoVarArgs
{
	public static void mk(Integer I)
	{
		System.out.println("autoboxing");
	}
	public static void mk(int...i)
	{
		System.out.println("var args");
	}
	public static void main(String[] args)
	{
		int x=10;
        mk(x);
	}
}