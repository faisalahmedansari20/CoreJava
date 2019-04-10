package com.jvm.architecture;

import java.lang.reflect.Method;

public class TestClass {

	public static void main(String[] args) throws ClassNotFoundException
	{
		Class forName = Class.forName("com.jvm.architecture.Student");
		Method[] declaredMethods = forName.getDeclaredMethods();
		for(Method method : declaredMethods)
		{
			System.out.println(method.getName()+" "+method.getModifiers());
		}
		
		Class<?> forName2 = Class.forName("com.jvm.architecture.Student");
		System.out.println(forName==forName2);
		System.out.println(forName.hashCode()+" "+forName2.hashCode());
		
		Student student = new Student();
		Student student2 = new Student();
		Class<? extends Student> class1 = student.getClass();
		Class<? extends Student> class2 = student2.getClass();
		System.out.println(class1 == class2);
		System.out.println(class1.hashCode()+" "+class2.hashCode());
	}
}

class Student
{
	int i = 33;
	String name = "many";
	public  void sk(String s,Integer i)
	{
		System.out.println("hi");
	}
	public Student() {
		System.out.println("in the Student Constructor");
	}
}