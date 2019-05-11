class Instance
{
	int  i;
	{
		System.out.println("first instance"+i);
	}

	{
		System.out.println("second instance"+i);
	}

     Instance()
	{
		 System.out.println("first constructor");
	}
	Instance(int k)
	{
		 System.out.println("second constructor");
	}
}

class K
{
	public static void main(String[] args)
	{
		Instance obj=new Instance();
	}
}