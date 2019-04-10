package com.jvms;

import java.util.Iterator;
import java.util.Properties;

public class JVMMemory {

	public static void main(String[] args)
	{
		
		JVMMemory  jvmMemory = new JVMMemory();
		ClassLoader classLoader = jvmMemory.getClass().getClassLoader();
		String name = classLoader.getClass().getName();
		System.out.println(name); 
		
		Properties properties = System.getProperties();
		Iterator<Object> iterator = properties.keySet().iterator();
		while(iterator.hasNext())
		{
			String next = (String)iterator.next();
			System.out.println(next+"   @@=  "+properties.getProperty(next));
		}
		
		
		
		
		/*JVMMemory jvmMemory = new JVMMemory();
		String name = jvmMemory.getClass().getClassLoader().getClass().getName();
		System.out.println(name);*/
		
		
		/*long l = 1000*1000;
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.freeMemory()/l);
		System.out.println(runtime.totalMemory()/l);
		System.out.println(runtime.maxMemory()/l);
		System.out.println(runtime.availableProcessors());*/
	}
}
