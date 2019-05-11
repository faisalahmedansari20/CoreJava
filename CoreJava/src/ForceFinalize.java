class ForceFinalize
{
	int a=50;

	protected void finalize() throws Throwable
	{
       System.out.println("finalize is executed forcefully");
	}
}