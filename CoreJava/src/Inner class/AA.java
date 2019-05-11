class AA
{
	int x=30;
	public  void mk()
	{
		int x=20;
         
		class BB
		{
			int x=40;
          public  void gk()
			{
			  int x=50;
			  System.out.println(AA.this.x);
			}
		}
		BB obj=new BB();
	    obj.gk();
	}
	public static void main(String[] args)
	{
		AA a=new AA();
		a.mk();
	}

}