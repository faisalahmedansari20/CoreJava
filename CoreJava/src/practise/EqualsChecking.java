class EqualsChecking
{
		int k=9;
		int e=7;
		int r=9;
		String s="ab";
		String s1="ab";

    public void mk()
	{
		if(s==s1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

	public static void main(String[] args)
	{

       EqualsChecking obj=new EqualsChecking();
	   obj.mk();



 
	}

}