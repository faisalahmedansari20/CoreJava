package com.par;

import java.util.ArrayList;

public class Testing implements I3
{

	@Override
	public void sk() {
       System.out.println("hi");		
	}
	
	public void gk()
	{
		System.out.println("in gk");
	}

}

interface I3
{
	public void sk();
}

class Main
{
	public static void main(String[] args)
	{
        ArrayList<String>  arrayList = new ArrayList<>();		
        System.out.println(arrayList.getClass().getClassLoader().getClass().getName());
		String s  = new String("hi");
		
		I3 i3 = new Testing();
		 i3.sk();
		 
		 Testing testing = new Testing();
//		 testing.
	}
}