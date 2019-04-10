package com.oops;

import java.io.EOFException;

public class Abst {

	public  Object m1(Object  object)
	{
		return object;
	}
	
	public static final Object m3(Object  string)
	{
		return string;
	}
	static  Object m3(String  string)
	{
		return string;
	}
	public  void m2() throws Exception
	{
		
	}
}

class C extends Abst
{
	@Override
	public  final void m2() throws EOFException,InterruptedException
	{
		
	}
	
	public  String m1(Object string)
	{
		return null;
		  
	}
}

abstract class Abs1 extends Abst
{
	public abstract Object m1(Object string);
}