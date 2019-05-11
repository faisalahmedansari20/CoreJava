class ExceptionChecking
{
	 public static void mk()
	{
		 int i=10;
		 int k=0;
        try
        {
              		 int j=i/k;
        }
        catch (Exception  e)
        {
            e.printStackTrace();
//			System.out.println("put proper value of k or i"+e);
		}
		 System.out.println("uyes");
	}
	public static void main(String[] args)
	{
//      ExceptionChecking obj=new ExceptionChecking();
	  //obj.mk();
	     ExceptionChecking.mk();
	}
}