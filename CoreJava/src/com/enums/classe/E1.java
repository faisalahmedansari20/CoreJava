package com.enums.classe;

  enum E1
{
	RA(2),RB(3),RC(2),RD(1);
	  
	  private E1(int i) {
		  System.out.println("enum constructor "+i);
	}
	  
	 public static void main(String[] args)
	 {
		 E1.RA.equals(E1.RB);
		 
		 E1 e1 = E1.RA;
	 }
}
  
  class Test 
  {
	  public static void main(String[] args)
	  {
		  
		  E1[] values = E1.values();
		  for(E1 out : values)
		  {
			  System.out.println(out+" "+out.ordinal());
		  }
		  
		  E1 e1 = E1.RA;
		  
		  switch(e1)
		  {
		    case  RB:
		    	   System.out.println("in the RB");
		    	   break;
		    	   
		    case  RC:
		    	   System.out.println("in the RC");
		    	   break;	   
		    	   
		    case  RD:
		    	   System.out.println("in the RD");
		    	   break; 	   
		    
		    case  RA:
		    	   System.out.println("in the RA");
		    	   break;
		  }
	  }
  }
