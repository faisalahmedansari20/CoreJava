class PrintingTheNumber
{
	int p=1;
	public void mk(int x)     // x=21
	{
		if(x>1)
		{
			for(int k=1;k<=x;k++)
			{
				for(int j=1;j<=k;j++)
				{
					System.out.print(p+" ");
                	p++;
				}
				if((x-p+1)<=k){break;}
                System.out.println();
			}
		}
	}
	public static void main(String[] args)
	{
      PrintingTheNumber obj=new PrintingTheNumber();
	  obj.mk(10);
	}
}

