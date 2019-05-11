class GettingGetClass
{
	public static  void mk()
	{
        Class c=Class.getclass();
		System.out.println(c.getName());
	}




	public static void main(String[] args)
	{
          GettingGetClass obj=new GettingGetClass();
		  obj.mk();
	}
}