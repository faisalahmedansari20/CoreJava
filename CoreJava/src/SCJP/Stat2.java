class Stat1
{ 
	
	
	static
	{
		System.out.println("in the static block of parent ");
		gk();
	}
	public static void gk()
	{
		System.out.println("in the static method parent gk method="+i);
	}
			static int i=10;


	public static void main(String[] args)
	{
      gk();	
	}
}

public class Stat2 extends Stat1
{
	int p;
	public void nonSta()
	{
		System.out.println("out put value of the instance variable="+p);
	}
	static 
	{
		System.out.println("in the static block of child ");
         mk();
	}
	public static void mk()
	{
		System.out.println("in the mk method of child class =");
	}
	public static void main(String[] args)
	{
		new Stat2().nonSta();
		mk();
	}
		static int x;

}










