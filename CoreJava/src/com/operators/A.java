package com.operators;

public class A {
   void m1()
   {
	   System.out.println("hi");
   }
}

class B extends A 
{
	@Override
	void m1()
	   {
		   System.out.println("by");
	   }
	
	public static void main(String[] args)
	{
		B b = new B();
		b.m1();
	}
}