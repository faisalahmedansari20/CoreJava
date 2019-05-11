class Instance
{
    static{
		System.out.println("in the static  instance block");
	}
	{
		System.out.println("in the first instance block");
	}

	Instance()
	{
	{
		System.out.println("in the constructor instance block");
	}
}


	public void mk()
	{
		    {
		System.out.println("in the method	 instance block");
	}

		System.out.println("in the mk method");
	}

	public static void main(String[] args)
	{
		Instance obj=new Instance();
	}
}