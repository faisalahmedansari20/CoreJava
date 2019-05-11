class OuterSta
{
	int i=20;
	static int y=20;

	static class InnerStac
	{
		public void mk()
		{
//		System.out.println(i);   // compile time error : non static variable i can not be referenced from a static context
		System.out.println(y);
		}
	}
	public static void main(String[] args)
	{
		InnerStac obj=new InnerStac();
		obj.mk();
	}
}