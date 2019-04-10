package com.oops;

public class Overloading {

	public static void main(String[] args)
	{
		A a = new B();
		a.mk1("r");
//		System.out.println(a.i);
//		a.mk(2);
	}
}

class A
{
	 int i = 44;
	public void mk(int...is )
	{
		System.out.println("hi");
	}
	public void mk1(Object object )
	{
		System.out.println("hi in mk1 parent");
	}
	
}
class B extends A
{
	static	int i = 443;
	public void mk(int... is )
	{
		System.out.println("by");
	}
	public void mk1(String string )
	{
		System.out.println("by in mk1 child");
	}
}