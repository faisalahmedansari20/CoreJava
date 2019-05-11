class AtomicChecking
{
	public void mk()
	{
		for(int i=1;i<6;i++)
		{
			System.out.println(i);
			 i=10;
		}
	}
	public static void main(String[] args)
	{
		 
     AtomicChecking obj=new AtomicChecking();
	   obj.mk();
	}
}