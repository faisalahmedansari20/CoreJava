package com.locale.creation;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Tree {

	public static void main(String[] args)
	{
		/*List ls = new ArrayList<>();
		
		ls.add("dd");
		ls.add(10);
		ls.add(null);
		System.out.println(ls);
		
		TreeSet set = new TreeSet<>();
//		set.add(null);
		set.add("add");
		set.add(10);
		System.out.println(set);*/
		
		HashSet hs = new HashSet<>();
		
		hs.add("sd");
		hs.add(23);
		hs.add(3);
		hs.add(null);
		System.out.println(hs);
		
     LinkedHashSet hs1 = new LinkedHashSet<>();
		
		hs1.add("sd");
		hs1.add(23);
		hs1.add(3);
		hs1.add(null);
		System.out.println(hs1);
		
	}
}
