class VariableCheck
{
	int k;

	public void mk()
	{
		k=1;
        k++;
		System.out.println(k);
	}
	public void gk()
	{
		k=5;
		k++;
		System.out.println(k);
	}

   public static void main(String[] args)
	{
	   VariableCheck obj=new VariableCheck();
       System.out.println(k);
	    obj.mk();
	    obj.gk();
       System.out.println(k);

	}
}