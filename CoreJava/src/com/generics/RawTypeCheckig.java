package com.generics;

public class RawTypeCheckig {

	
	public static void main(String[] args)
	{
	  Box1<String>	 box1 = new Box1<>();
	  box1.setT("d");
	  
	  Box1 box12 = new Box1();
	  box12 = box1;
	  box12.setT("e");
	  System.out.println(box12.getT());
	  
	}
}

class Box1<T>
{
 private	T t;

public T getT() {
	return t;
}

public void setT(T t) {
	this.t = t;
}
}
