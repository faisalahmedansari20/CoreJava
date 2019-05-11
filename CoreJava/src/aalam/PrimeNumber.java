class PrimeNumber
{
	boolean b=true;
     public void mk()
	{
		 int n=16;
		for(int k=2;k<n;k++)
		{
			if(n%k==0)
			{
				System.out.println("the number "+n+" is not a prime number");
				b=false;
				break;
			}
		}
		if(b==true)
		{
			System.out.println("the number "+n+" is a prime number");
		}
	}


	public static void main(String[] args)
	{
	 	  new PrimeNumber().mk();
	}
}