package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Refl {

	private String name;
	private int id;

	public Refl(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
     
	public Refl() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

 
}
class Main
{
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException
	{
		Refl refl = new Refl();
		Field[] declaredFields = refl.getClass().getDeclaredFields();
		System.out.println(Arrays.toString(declaredFields));
		
		Class<?> forName = Class.forName("com.reflection.Refl");
		Constructor<?>[] constructors = forName.getConstructors();
		Constructor<?>[] declaredConstructors = forName.getDeclaredConstructors(); 
//		Constructor<?> declaredConstructor = forName.getDeclaredConstructor(forName);
//		System.out.println(declaredConstructor);
		System.out.println(Arrays.toString(declaredConstructors));
		System.out.println(Arrays.toString(constructors));
		
		Method[] declaredMethods = forName.getDeclaredMethods();
		System.out.println(Arrays.toString(declaredMethods));
		
	}
}