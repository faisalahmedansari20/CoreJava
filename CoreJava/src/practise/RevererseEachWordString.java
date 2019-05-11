class RevererseEachWordString
{
    public static String mk(String s)
	{
		String[] str=s.split("\\s");
		String reverseString="";
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			String reverseWord="";

			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+word.charAt(j);
			}

            reverseString=reverseString+reverseWord+" ";
       }
           return reverseString;
	}
   




	public static void main(String[] args)
	{
		String s="ab de ";
        RevererseEachWordString obj=new RevererseEachWordString();
      String rev=		obj.mk(s);
		System.out.println("the reverse of String "+s+" is "+rev);
 		//System.out.println("the reverse string of "+s+" is ="+RevererseEachWordString.mk());
	}
}