 class Checking
{
	 int x=10;
	public static void mk()
	{
		System.out.println("in the mk method of the Checking class of abstract class");
	}

//	public static void main(String[] args)
//	{
////           Checking obj=new Checking();
//		   Checking.mk();
//	}
}

class Checked extends Checking
{
	int x=200;
	public static void main(String[] args)
	{
		Checked obj=new Checked();
		System.out.println(new  Checking().x);
	}
		 
}