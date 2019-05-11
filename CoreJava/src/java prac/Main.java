class AA
{
	public void mk()
	{
		System.out.println(" in AA");
	}
}
   class BB extends AA
   {
	   public void mk()
	   {
		   System.out.println("in BB");
	   }
   }
   class CC extends BB
   {
	   public void mk()
	   {
		   System.out.println(" in CC");
	   }
   }
   class Main
   {
	   public static void main(String[] args)
	   {
//		   AA a=new CC();
		   AA a=new BB();

		   a.mk();
	   }
   }