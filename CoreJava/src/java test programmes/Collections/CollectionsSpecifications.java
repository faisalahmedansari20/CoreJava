import java.util.*;

public class CollectionsSpecifications
{
 public static void main(String[] args)
 {
  List<String> ls=new ArrayList<>();   // maintains insertion  and contains duplicate elements . it is a non-synchronized and uses dynamic array for storing the elements and hence manipulation is slow in this class.
//  List<String> ls=new LinkedList<>();  // maintains insertion  and contains duplicate elements . it uses doubly linked list to store the elements and hence manipulation is fast in this class.
//  Set<String>  ls=new HashSet<>();     // maintains no order of insertion  and stores only unique elements. stores the element by a mechanism call hashing.
//  Set<String>  ls=new LinkedHashSet<>(); //maintains insertion and contains only unique elements. does not allow null elements.
//  Set<String>  ls=new TreeSet<String>();  //maintains ascending order and contains only unique elements 
//  Queue<String>ls=new PriorityQueue<>();	// maintains no order and can contain duplicate elements.
//  Deque<String>ls=new ArrayDeque<>();     //maintains insertion order andd can contain duplicate elments.can add and remove elements. it is not thread safe in the absesnce of external synchronization and it is faster than the linked list and stack
//  Map<Integer,String> mp=new HashMap<>();  // maintains ascending order on the basis of key and doesnt allow duplicate key it has one null key and multiple null values contains values based on key and it is a non Synchronized
//  Map<Integer,String> mp=new LinkedHashMap<>(); //maintains insertion  order on the basis of key and doesnt allow duplicate key it has one null key and multiple null values contains values based on key it is a non Synchronized
//  Map<Integer,String> mp=new TreeMap<>();    // maintains ascending order on the basis of key and doesnt allow duplicate key it doesnt have null key bit has multiple null values contains values based on key it is a non Synchronized
    Hashtable<Integer,String> mp=new Hashtable<>();// maintains descending order and contains elements on the basis of key and contains only unique elements  and it is Synchronized

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

List<String> ls=new ArrayList<>();   // maintains insertion  and contains duplicate elements

   ls.add("Zebra");
   ls.add("mumbai");
   ls.add("mumbai");
   ls.add("goa");
   ls.add("banglore");
   ls.add("chennai");


     ls.add("E");
	 ls.add("B");
	 ls.add("B");
     ls.add("A");
	 ls.add("C");
	 ls.add("D");



   for(String s:ls)
   {
//    System.out.println(s);
    }
    }
}