import java.util.*;

class NavigableSort
{
	public static void main(String[] args)
	{
//		TreeSet s=new TreeSet();
        TreeMap s=new TreeMap();


		s.put(10,"A");
		s.put(20,"B");
		s.put(30,"C");
		s.put(5,"D");
		s.put(110,"E");
		s.put(102,"F");
		s.put(104,"G");

        System.out.println(s);
		System.out.println(s.firstKey());
		System.out.println(s.headMap(102));
		System.out.println(s.tailMap(102));



//		System.out.println(s.floorKey(110));
//		System.out.println(s.lowerKey(110));
//		System.out.println(s.ceilingKey(21));
//		System.out.println(s.higherKey(102));
//		System.out.println(s.pollFirstEntry());
//		System.out.println(s.pollLastEntry());
//		System.out.println(s.descendingMap());


//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(5);
//		s.add(110);
//		s.add(102);
//		s.add(104);
//		s.add(104);

//		System.out.println(s.floor(110));
//		System.out.println(s.lower(110));
//		System.out.println(s.ceiling(21));
//		System.out.println(s.higher(102));
//		System.out.println(s.pollFirst());
//		System.out.println(s.descendingSet());

}
}