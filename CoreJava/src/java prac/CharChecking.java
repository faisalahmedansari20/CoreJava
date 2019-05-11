class CharChecking
{
	public static void main(String[]args)
	{
		String s=" hi how are you ";
		char[] ch=s.toCharArray();
	
	   char[] c=new char[s.length()];

	   for(int i=0;i<s.length();i++)
		{
		   c[i]=s.charAt(i);
		}

		System.out.println(c[0]);
	}
}