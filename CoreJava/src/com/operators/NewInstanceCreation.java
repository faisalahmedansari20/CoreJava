package com.operators;

public class NewInstanceCreation {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		  Object newInstance = Class.forName(args[0]).newInstance();
		  System.out.println(newInstance.getClass().getName());
	}
}

class Student
{
	String name ="malik";
	
	/*public static void main(String[] arg)
	{
		System.out.println("jo");
	}*/
}