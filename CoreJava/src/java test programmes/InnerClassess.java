class InnerClassess
{
 privat int data=30;
  
  class Inner
  {
   public void msg()
   {
     System.out.println("data is "+data);
     }
     }
     public static void main(String[] args)
     {
      InnerClassess is=new InnerClassess();
     InnerClassess.Inner in=is.new Inner();
     in.msg();
     }
     }