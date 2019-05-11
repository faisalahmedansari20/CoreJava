class Add
{
	public static void main(String[] args)
	{
		int x=10;
		x=(++x)++;   // error
		x=(++x);    // compile and run 
		System.out.println(x);
	}
}