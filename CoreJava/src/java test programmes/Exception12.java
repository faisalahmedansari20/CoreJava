class Exception12
{
 public int mk(int a,int b) 
 {


	 int k=a/b;
	 return k;
  }

  public static void main(String[] args)
  {
	  try
	  {
       Exception12 c=new Exception12();
	  System.out.println(c.mk(15,0));
     		
	  }
	  catch (Exception e)
	  {
		  System.out.println(e.getMessage());
	  }

  }
}
    