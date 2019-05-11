import java.util.*;

class DuplicateCharacters
{
   public static void main(String[] args)
	{
	   String s="india is a india best of india";

	   Map<Character,Integer> mp=new HashMap<>();
	   char[] ch=s.toCharArray();

	   for(Character c:ch)
		{
		   if(mp.containsKey(c))
			{
			   mp.put(c,mp.get(c)+1);
			}
			else
			{
				mp.put(c,1);
			}
		}
		
		Set<Character> set=mp.keySet();
		for(Character ch1:set)
		{
			System.out.println(ch1+" "+mp.get(ch1)+"times");
		}
	}

}
