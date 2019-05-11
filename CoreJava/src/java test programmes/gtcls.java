class GetClass
{
  public void mk()
  {
   System.out.println(getClass().getName());
   }

   public static void main(String[] args)
   {
    GetClass gtcls=new GetClass();
    gtcls.mk();
    }
}