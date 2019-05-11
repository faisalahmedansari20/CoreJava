import java.util.*;

class Duplicate
{
	public static void main(String[] args)
	{
		String s="indiaiapppppppddddddddjjjjjjjjaaaaaaa";
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
					  System.out.print("the character "+c+" has "+hs.get(c)+" duplicate characters in the given String and has indexes at ");
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
}