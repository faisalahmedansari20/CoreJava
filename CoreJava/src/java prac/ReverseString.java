class ReverseString
{
	public static void main(String[] args)
	{
		String s="aba";
		String rev="";
		for (int i=s.length()-1;i>=0;i-- )
		{
			rev+=s.charAt(i);
		}
		System.out.println(" rev "+rev);
		if(s.equals(rev))
		{
			System.out.println("it is a palindrome");
		}
	}

}