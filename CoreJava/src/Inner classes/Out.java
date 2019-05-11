class Out
{
	public void mk()
	{
		class InOut
		{
			public void sum(int x,int y)
			{
				System.out.println("addition of the no is="+(x+y));
			}
		}
			InOut obj=new InOut();
			obj.sum(10,20);
	}
	public static void main(String[] args)
	{
		Out o=new Out();
		o.mk();
	}
}