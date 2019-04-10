package com.test;

interface Int extends i2,i3
{

}

interface i2
{
	public void m1();
//	int i ;
//	static
	/*{
		
	}*/
}

interface i3
{
	public void m1();
}

class A
{
	protected void priv() {

		System.out.println("eef");
	} 
}

class B extends A
{
	@Override 
	public  void priv() {
		System.out.println("f");

	}
}
