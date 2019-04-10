package com.collection;

public class CollectionChecking {

	public static void main(String[] args)
	{
		
		/*Object o = new String("hi");
		StringBuffer buffer = (StringBuffer)o;
		System.out.println(buffer.toString());
		
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("ahmed");
		
		Iterator<String> iterator = arrayList.iterator();
		
		while(iterator.hasNext())
		{
			String next = iterator.next();
			System.out.println(next);
		}*/
		  C o = new B();
		  A c    = (B)o;   
		  System.out.println(o);
		  System.out.println(c);
		
	}
}
class A 
{}
class C extends A 
{}
class B extends C 
{}