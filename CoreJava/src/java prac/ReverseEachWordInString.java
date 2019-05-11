class ReverseEachWordInString
{
	public static void main(String[] args)
	{
		String s="word india  world";
		String[] split=s.split("\\s");
		String rev="";
		
		for(String w:split)
		{
			String revword="";

			for(int i=w.length()-1;i>=0;i--)
			{
				revword+=w.charAt(i);
			}
			rev+=revword+" ";
		}
		System.out.println(s);
		System.out.println(rev);
	}


}
