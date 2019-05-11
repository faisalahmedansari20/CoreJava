class Outer2
{
	int x=30;
	static int y=49;

	class Inner2
	{
		public void mk()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args)
	{
		new Outer().new Inner().mk();
	}
}