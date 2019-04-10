package com.generics;

import java.util.ArrayList;
import java.util.List;

public class MaximumTest {

	public    void sk(List<? super Number> es)
	{
		
	}
	public void sk1(List<? extends Number> es)
	{
		
	}
	
	public void m1(List<Integer> integers )
	{
		System.out.println("hi");
	}
	public void m1(ArrayList<Integer> integers )
	{
		System.out.println("by");
	}
	
	/*public void m1(I i )
	{
		System.out.println("hi");
	}
	public void m1(B b)
	{
		System.out.println("by");
	}
	*/
	public static void main(String[] args)
	{
//		new MaximumTest().m1(new C());
		ArrayList<Integer> arrayList = new ArrayList<>();
		new MaximumTest().m1(new ArrayList<>());
		Integer integer = new Integer(102);
		Integer integer1 = new Integer(10);
		
		
		System.out.println(integer.compareTo(integer1));
	}
}

interface I
{
	
}
class B implements I
{
	
}
class C implements I
{
	
}

