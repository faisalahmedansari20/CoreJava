import java.util.*;

public class ArrayToLinked
{
 public static void main(String[] args)
 {
  List<String> ls=new ArrayList<String>();

  ls.add("one");
  ls.add("two");
  ls.add("one");

  Set<String> s=new LinkedHashSet<String>(ls);
  System.out.println(s);

  System.out.println(ls);
 }
}