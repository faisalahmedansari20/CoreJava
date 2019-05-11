import java.util.*;

class RmoveElement
{
 public static void main(String[] args)
 {
  List<String> ls=new ArrayList<>();

    ls.add("one");
    ls.add("two");
    ls.add("one");

    System.out.println("before the removing duplicate element"+ls);

	Set<String> st=new HashSet<>();
  
    st.addAll(ls);

	ls.clear();

	ls.addAll(st);
	System.out.println("after the  removig the duplicate elements"+ls);
 }
}
