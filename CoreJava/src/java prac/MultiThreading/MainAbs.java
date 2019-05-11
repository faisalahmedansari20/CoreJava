abstract class Abs
{
	public static void mk()
	{
		System.out.println("in the mk of the abdtract class");
	}
}

class MainAbs extends Abs
{
	public static void mk()
	{
		System.out.println("in the main mk method");
	}

	public static void main(String[] args)
	{
		Abs.mk();
		Abs obj=new MainAbs();
//		obj.mk();
	}
}