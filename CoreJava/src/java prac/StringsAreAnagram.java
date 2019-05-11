import java.util.Arrays;
class StringsAreAnagram
{
	public static  void main(String[] args)
	{
		String s1="india is     best";
		String s2="best is india";

		  s1=s1.replaceAll("\\s","");
		  s2=s2.replaceAll("\\s","");
       
	     boolean status=true;

		if(s1.length()!=s2.length())
		{
			System.out.println(" in the not ");
			status=false;
		}
		else
		{ 
			char[] sa1=s1.toLowerCase().toCharArray();
			char[] sa2=s2.toLowerCase().toCharArray();

			Arrays.sort(sa1);
			Arrays.sort(sa2);

			status=Arrays.equals(sa1,sa2);	
		}
		if(status)
			{
				System.out.println("s1 and s2 are anagrams"	 );
		   }
		   else
			{
			   System.out.println("s1 and s2 are not anagrams");
			}
	}
			  


}