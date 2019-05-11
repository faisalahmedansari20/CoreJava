interface MainInterf
{
	public void mk();
	public void gk();
}

abstract class ImpInter implements MainInterf 
{
	public void mk()
	{
		System.out.println("in the mk of MainInterf");
	}
}

class MainClass extends ImpInter 
{
	public void gk()
	{
		System.out.println("in the gk ");
	}

	public static void main(String[] args)
	{
     MainClass obj=new MainClass();
	 
	 obj.mkgk();
	}
}