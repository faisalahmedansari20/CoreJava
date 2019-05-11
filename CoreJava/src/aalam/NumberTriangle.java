class NumberTriangle
{
	public void mk(int x)
	{
		for(int k=1;k<=x;k++)
		{
			for(int j=1;j<=k;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();

		}
	}
		public static void main(String[] args)
		{

         NumberTriangle obj=new NumberTriangle();

		   obj.mk(10);
		}
	}