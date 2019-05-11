import java.util.*;

public class CollectionChecking 
{
  public static void mk()
  {
	  List<String> ls=new ArrayList<>();
	  ls.add("a");
	  ls.add("b");
	  ls.add("c");
	  
	  List<String> ls1=new ArrayList<>();
	   ls1.add("d");
	   ls1.add("e");
	   ls1.add("f");
	   
	  List<List> lsls=new ArrayList<>();
	  lsls.add(ls);
	  lsls.add(ls1);
	  
	  Iterator<List> itr=lsls.iterator();
	  while(itr.hasNext())
	  {
		  Object lsc=itr.next();
		  List lst=(List)lsc;
		  Iterator<String> itr1=lst.iterator();
		  while(itr1.hasNext())
		  {
			  String s=itr1.next();
			  System.out.println(s);
		  }
	  }
  }
	
  public static void main(String[] args)
  {
    mk();	  
  }
	
}
