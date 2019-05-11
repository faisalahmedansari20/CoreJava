class That
{
	public void mk(Object o )
	{
		  System.out.println(this);
		  System.out.println(o);
	}
  public static void main(String[] args)
  {
	  That t=new That();

	   t.mk(t);
 
   }

}