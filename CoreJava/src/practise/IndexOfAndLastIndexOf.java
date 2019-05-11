class IndexOfAndLastIndexOf
{
	public static void main(String[] args)
	{
		String s="abbabbabb";

		for(int i=0;i<s.length();i++)
		{
          char c=s.charAt(i);
		  if(s.indexOf(c)!=s.lastIndexOf(c))
			{
			  return false;
			}
		}
		return true;	
		

		System.out.println(s.lastIndexOf("a"));
	}
}