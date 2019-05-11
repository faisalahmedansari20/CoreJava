class InstanceCheck
{
		String s;
		int a;

	public  void mk()
	{
		System.out.println(s+" "+a);
	}

	public static void main(String[] args)
	{
		new InstanceCheck().mk();
	}

}