package com.enums.classe;

public class EnumClass {

	static int i = 40;	
	int x = 44;
  public static void main(String[] args)
  {
	 /* A[] values = A.values();
	  for(A a : values )
	  {
		  System.out.println(a.ordinal());
	  }*/
	  new EnumClass().mk();
  }
  public void mk()
  {
	  System.out.println(i+" "+x);
	  System.out.println(d+" "+p);
  }
  static int d = 44;
  int p =66;
}

enum A
{
	Man,Women,Kite;
}
