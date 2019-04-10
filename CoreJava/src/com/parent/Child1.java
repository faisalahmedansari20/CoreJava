package com.parent;

public class Child1 extends ParentClass {

	public static void main(String[] args)
	{
		ParentClass class1 = new ParentClass();
		class1.mk();
		
		Child1 child1 = new Child1();
		child1.mk();
		
		ParentClass class2 = new Child1();
		class2.mk();
	}
}
