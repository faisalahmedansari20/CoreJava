class SubstringChecking
{
	public boolean mk(String s1,String s2)
	{
         boolean b=true;

		String s3=s1.replaceAll("\\s","");
		String s4=s2.replaceAll("\\s","");
//		System.out.println(s3+" ="+s4);

       if(s3.length() !=s4.length())
		{
		   return false;
//		   System.out.println(s1+" and are not anagram "+s2);
		}
		char[] ch=s3.toCharArray();

		for(char c:ch)
		{

			int index=s4.indexOf(c);
			if(index !=-1)
			{
				s4=s4.substring(0,index)+s4.substring(index+1,s4.length());
			}
			else
			{
			System.out.println(s1+" and are not anagram "+s2);
             return false;
			}
		}

		return true;
	}

		

	public static void main(String[] args)
	{
        SubstringChecking obj=new SubstringChecking();

       System.out.println(obj.mk("abce de","de abc"));

	}

}