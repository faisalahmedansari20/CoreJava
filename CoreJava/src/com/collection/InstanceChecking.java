package com.collection;

public class InstanceChecking {

	Runtime runtime = Runtime.getRuntime();
	
	static{
		System.out.println("in the static block");
	}
	
	{
		System.out.println("in the instance block");
	}
	static InstanceChecking checking = new InstanceChecking();
	
   	InstanceChecking()
	{
   		this(3);
		System.out.println("in the constructor");
	}
   	InstanceChecking(int i)
	{
		System.out.println("in the constructor");
	}
	
	public static void main(String[] args)
	{
		new InstanceChecking();
	}
}
