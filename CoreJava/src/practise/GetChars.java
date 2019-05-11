class GetChars
{
	public static void min(String[] args)
	{
		String s="my nam is khan india";
		System.out.printn(s.length());

		char[] ch=new chr[10];
		try
		{
			s.getChars(1,11,ch,0);
         System.out.println(ch);  
		}
		catch (Exception e)
		{
			System.out.println("bits are more"+e);
		}
	}
}