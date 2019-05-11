class Inst
{
	static final int in;
	static
		{
	       in=20;
    	}
	Inst()
	{
	}

   public static void main(String[] args)
	{
        Inst obj=new Inst();
		System.out.println(in);
	}
}