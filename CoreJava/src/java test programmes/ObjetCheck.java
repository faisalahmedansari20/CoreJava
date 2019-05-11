class ObjetCheck
{
	int k=0;
	public void mk()
	{ 
		
		while(true)
		{
        k++;
        System.out.println(k);
		new ObjetCheck();
		}
	}
	 public static void main(String[] args)
	{
		 new ObjetCheck().mk();
	}
}