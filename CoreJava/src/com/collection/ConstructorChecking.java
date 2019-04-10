package com.collection;

public class ConstructorChecking {

	
	
	public static void main(String[] arg)
	{
		Runtime runtime = Runtime.getRuntime();
		Class<? extends Runtime> class1 = runtime.getClass();
		System.out.println(runtime);
		
		
		Runtime runtimeq = Runtime.getRuntime();
		System.out.println(runtimeq);
	}
}


class A1
{
	A1(int i)
	{
		
	}

 
}
class B1 extends A1
{

	B1(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	 
	
}