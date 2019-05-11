class Out2
{
	public void mk()
	{
		int x=10;
		class In2Out2
		{
			public void gk()
			{
				System.out.println("in "+x);
			}
		}
		In2Out2 obj=new In2Out2();
		obj.gk();
	}
	public static void main(String[] args)
	{
		Out2 o=new Out2();
		o.mk();
	}
}