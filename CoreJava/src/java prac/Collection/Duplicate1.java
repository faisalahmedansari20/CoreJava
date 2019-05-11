import java.util.*;

class Duplicate1
{
	public static void duplicateChar(String s)
	{
         char[] ch=s.toCharArray();
         HashMap<Character,Integer> hs=new HashMap<>();
             
		       for(Character c:ch)
		       {
                    if(hs.containsKey(c))
					{
                       hs.put(c,hs.get(c)+1);
					}
					else
				   {
                       hs.put(c,1);
				   }
			   }
			   Set<Character> st=hs.keySet();
			   for(Character c:st)
		        {
                  if(hs.get(c)>1)
					{
					  System.out.print("the character "+c+" has "+hs.get(c)+" duplicate characters in the given String at indexes at ");
                      for(int i=0;i<s.length();i++)
						{
						  if(c==s.charAt(i))
							{
							  System.out.print(" "+i+" ");
							}
						}
						System.out.println();
				   }
				}

	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("insert the Word");
         String s=sc.nextLine(); 

	     duplicateChar(s);
	}
}