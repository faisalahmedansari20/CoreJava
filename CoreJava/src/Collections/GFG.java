import java.io.*;
import java.util.*;
 
class Geek 
{
    String name;
    int id;
      
    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
     }

       public int hashCode()
	{
		   return name.hashCode()+id;
	}
	 public boolean equals(Object o)
	{
		 Geek g=(Geek)o;
		 return g.name.equals(this.name) && g.id==this.id;
	}
}
 
public class GFG 
{
    public static void main (String[] args) 
    {
         
        // creating two Objects with 
        // same state
        Geek g1 = new Geek("aditya", 1);
        Geek g2 = new Geek("aditya", 1);
         
        Map<Geek, String> map = new HashMap<Geek, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");
         
        for(Geek geek : map.keySet())
        {
            System.out.println(map.get(geek).toString());
        }
 
    }
}