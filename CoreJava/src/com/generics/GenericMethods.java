package com.generics;

public class GenericMethods {

	public static <E> void mk(E[] e) {
		/*for (E e2 : e) {
//			 System.out.println(e2.getClass().getName());
		}*/
	}

	public static void main(String[] ara) 
	{
		
		Integer[][][] integers = {{ { 1, 2, 3, 4 } }};
		
		System.out.println(integers[0].getClass().getName());
//		Character[][] characters = { {} };
//		System.out.println(characters);
		
		int[][] is = { { 1, 2, 3, 3 } };
		int[]  is2= {};
		System.out.println(is[0].getClass().getName());
		
		System.out.println(is2.getClass().getName());
		// System.out.println(is);
		Character[][] characters = { {'s'} };
		
		char[][] character = { { 'e', 'f', 't' } };
		/*System.out.println(characters.getClass().getName());
		System.out.println(character.getClass().getName());*/
		
		Integer[] integers2 = {1,2};
		Integer integer = 34;
//		mk(integer);
		// mk(character);
	}
}
