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

	public void gk()
	{
		System.out.println("in the gk of ImpInter");
	}
}

class MainClass extends ImpInter  implements MainInterf
{
//	public void gk()
//	{
//		System.out.println("in the gk of MainClass ");
//	}

	public static void main(String[] args)
	{
     MainClass obj=new MainClass();
	 
	 obj.mk();
	}
	
}