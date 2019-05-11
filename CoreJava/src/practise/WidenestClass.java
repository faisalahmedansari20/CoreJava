class WidenestClass
{
	public void mk(int i)
	{
		System.out.println("int is called "+i);
	}
	public void mk(float i)
	{
		System.out.println("float is called "+i);
	}
		public void mk(double  i)
	{
			System.out.println("double is called "+i);
	}

		public  static void main(String[] args)
	{
			WidenestClass obj=new WidenestClass();
			short s=20;
			byte b=10;
			int i=49;
			long l=50;
			float f=3.14f;
            double d=444444;
			obj.mk(d);
	}
}
