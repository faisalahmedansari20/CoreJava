package com.generics;

import java.util.List;

public class Box<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class SquareBox<T> extends Box<T> {

	/*public void sk(List<String>list )
	{
		
	}
	public void sk(List<Integer> integers)
	{
		
	}*/
	
}

class Main {
	private static <T extends Box> void mk(T box) {
		System.out.println(box.getT());
	}

	private static <T> void ms(T box) {
		System.out.println(((Box) box).getT());
	}

	public static void main(String[] argd) {
		Box<String> box = new Box<>();
		box.setT("MW");
		Box<Integer> box1 = new Box<>();
		box1.setT(10);

		Box<?> box2 = new Box<>();

		 box1 = (Box<Integer>)box2;
		am(box1);
		am(box);

		/*
		 * SquareBox<String> box2 = new SquareBox<>(); box2.setT("child");
		 * 
		 * mk(box); ms(box1); mk(box2);
		 */

	}

	public static  void am(Box<?> box) {
		Box<Integer> box2 = (Box<Integer>) box;
		System.out.println("=" + box2.getT());
	}
}

class DD<V>
{
	
}
