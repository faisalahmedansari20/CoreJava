import java.util.*;
 public class CollectionsSop
 {
  public static void main(String[] args)
  {
	  try
	  {
		
   ArrayList<String> ls=new ArrayList<>();

   ls.add("man");
   ls.add("women");
   System.out.println(ls);

   ArrayList ls1=new ArrayList<>();

    ls1.add("man");
	ls1.add("women");
    System.out.println(ls1);

    System.out.println(ls==ls1);
	System.out.println(ls.equals(ls1));
	System.out.println("ls1.hashCode()"+ls1.hashCode()+" ls.hashCode() "+ls.hashCode());
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
   }
}