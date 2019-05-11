class P extends C
{
  public void m()
  {
   System.out.println("hi how are you");
   }
 }


 public  class C
 {
   public void n()
   {
     System.out.println(" hi how are you n");
    }

     public static void main(String[] args)
     {
       C p=new P();
	     p.n();
      }
 }
  