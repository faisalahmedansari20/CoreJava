class Exception1
{
 public int mk(int a,int b)
 {
  int k=a/b;
  return k;
  }

  public static void main(String[] args)
  {
    Exception1 e=new Exception1();
   try 
     {
        System.out.println(e.mk(15,0));
	}

	catch(Exception e)
	{
	 System.out.println("you shouldn't divide any with Zero");
	 }
  }
}
    