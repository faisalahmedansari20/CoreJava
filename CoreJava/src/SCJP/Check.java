class Check
{
	 int i=49;
	public  void mk()
	{
		System.out.println("in the mk i="+i);
	}
	public  void gk()
	{
		System.out.println("in the gk i="+i);
	}
	public static void main(String[] args)
	{
		Check obj=new Check();
		obj.i=33;
		obj.mk();
        obj.gk();
		Check obj1=new Check();
        obj1.i=44;
		obj1.mk();
		obj1.gk();

	
	}
}