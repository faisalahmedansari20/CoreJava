class ReturnCheck
{
	static String s=null;

 static	public int mk()
	{
		if(s==null)
		
			return 5;
		
		return 8;
	}
	public static void main(String[] args)
	{
     int k=ReturnCheck.mk();
	 System.out.println(k);
	}
}