import java.util.*;

public class Collections
{
 public static void main(String[] args)
 {
//  List<String> ls=new ArrayList<>();   // maintains insertion  and contains duplicate elements
//  List<String> ls=new LinkedList<>();  // maintains insertion  and contains duplicate elements
//  Set<String>  ls=new HashSet<>();     // maintains no order of insertion  and stores only unique elements
//  Set<String>  ls=new LinkedHashSet<>(); //maintains insertion and contains only unique elements
//  Set<String>  ls=new TreeSet<String>();  //maintains ascending order and contains only unique elements 
//  Queue<String>ls=new PriorityQueue<>();	// maintains no order and can contain duplicate elements
//  Deque<String>ls=new ArrayDeque<>();     //maintains insertion order andd can contain duplicate elments
//  Map<Integer,String> mp=new HashMap<>();  // maintains ascending order on the basis of key and doesnt allow duplicate key it has one null key and multiple null values contains values based on key
//  Map<Integer,String> mp=new LinkedHashMap<>(); //maintains insertion  order on the basis of key and doesnt allow duplicate key it has one null key and multiple null values contains values based on key
//  Map<Integer,String> mp=new TreeMap<>();    // maintains ascending order on the basis of key and doesnt allow duplicate key it doesnt have null key bit has multiple null values contains values based on key

    mp.put(0,"ccc");
	mp.put(7,"");
	mp.put(8,"");
	mp.put(1,"aaa");
	mp.put(2,"mumbai");
	mp.put(1,"bbb");
	mp.put(3,"mumbai");
    mp.put(4,"goa");
	mp.put(5,"banglore");
	mp.put(6,"chennai");   


    for(Map.Entry m:mp.entrySet())
	 {
		System.out.println(m.getKey()+" "+m.getValue());
	 }


//   ls.add("Zebra");
//   ls.add("mumbai");
//   ls.add("mumbai");
//   ls.add("goa");
//   ls.add("banglore");
//   ls.add("chennai");
//
//
//     ls.add("E");
//	 ls.add("B");
//	 ls.add("B");
//     ls.add("A");
//	 ls.add("C");
//	 ls.add("D");


//   for(String s:ls)
//   {
//    System.out.println(s);
//    }
    }
}