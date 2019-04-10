package com.par;

import com.parent.ParentClass;

public class ChildInOther extends ParentClass {

	public static void main(String[] args)
	{
		ChildInOther childInOther = new ChildInOther();
		childInOther.mk();
		int p =childInOther.i;
		
		ParentClass class1 = new ParentClass();
//		int x = class1.i;
//		class1.mk();
		
		/*ParentClass class1 = new ChildInOther();
		class1.mk();*/
	}
	
}
