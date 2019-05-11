class OuterClass
{
	private int k=9;

	class InnerClass
	{
		public void mk()
		{
			System.out.println(k);
		}
	}

	public static void main(String[] args)
	{

//       OuterClass ob=new OuterClass();
	   OuterClass.InnerClass obj=new OuterClass().new InnerClass();
	   obj.mk();
	}
}