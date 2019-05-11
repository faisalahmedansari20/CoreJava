abstract class Norm
{
 abstract	public void mk();
 abstract	public void gk();
// abstract   public void ck();
 public void main()
	{
	 System.out.println("main");
	}
}

 class Main1 extends Norm
{
	public void mk()
	{
		System.out.println("mk method is executed");
	}
	public void gk()
	{
		System.out.println("gk method is invoked");

	}
	public static void main(String[] args)
	{
       Norm obj=new Main1();  //abstract and interface can not be instantiated. java interface contains only method signature but does not contains the method implementation .
	   obj.mk();
       obj.main();
      // obj.gk();
	   
	}
}