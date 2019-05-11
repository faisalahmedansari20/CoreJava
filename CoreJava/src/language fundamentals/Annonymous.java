class Annonymous
{
	public static void sum(int[] x)
	{
		int[] y=x;
		for(int x1:y)
		{
			System.out.print(" "+x1);
		}
      System.out.println(x.length);

	}

	public static void main(String[] args)
	{
		sum(new int[]{10,20,30});
	}
}