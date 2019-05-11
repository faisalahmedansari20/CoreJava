class ReverseStringWithSpaces
{
	public static void main(String[] args)
	{
		String s=" ab ";

		char[] ch=s.toCharArray();
		char[] c=new char[s.length()];

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				c[i]=' ';
			}
		}

		int j=c.length-1;

		for (int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				if(c[j]==' ')
				{
					j--;
				}
				else
				{
					c[j]=ch[i];
					j--;
				}
			}
		}
		System.out.println(s);
		System.out.println(String.valuOf(c));

		}
}