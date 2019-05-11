class Witho
{
	public void mk(Witho obj)
	{
		System.out.println(" method is invoked");
	    System.out.println(obj);
	}
	public void pk()
	{
            mk(this);
	}

	public static void main(String[] args)
	{
		new Witho().pk();
	}
}