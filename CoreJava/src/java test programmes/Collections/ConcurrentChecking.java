import java.util.*;
import java.util.concurrent.*;

public class ConcurrentChecking
{
	public static void main(String[] args)
	{
		Map<String,Integer> mp=new ConcurrentHashMap<>();

		  mp.put("1",1);
		  mp.put("2",1);
		  mp.put("3",1);
		  mp.put("4",1);
        System.out.println("one ConcurrentHashMap before iteration"+mp);
   
		  Iterator<String> itr=mp.keySet().iterator();

		  while(itr.hasNext())
		{
			   String s=itr.next();
//			  System.out.println(s.getKey()+" "+s.getValue()); 
			   if(s.equals("3"))
			{
				    mp.put(s+"new",1);
			}
		}
			System.out.println("two ConcurrentHashMap After Iteration"+mp);

           mp=new HashMap<String,Integer>();
		   mp.put("1",1);
		   mp.put("2",1);
		   mp.put("3",1);
		   mp.put("4",1);
		   mp.put("5",1);

           Iterator<String> itr1=mp.keySet().iterator();

 
		   while(itr1.hasNext())
			{
			   String s1=itr1.next();
			   if(s1.equals("3"))
				{
				   mp.put(s1+"new",1);
                  

				}
			}
			System.out.println("HashMap after Iteration"+mp);
		}
	}
