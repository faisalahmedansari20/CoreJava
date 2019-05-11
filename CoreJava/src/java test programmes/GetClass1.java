class GetClass1
{
  public void mk()
  {
   System.out.println(getClass().getName());
   System.out.println(Integer.toHexString(hashCode()));
   }

   public static void main(String[] args)
   {
    GetClass1 gtcls=new GetClass1();
    gtcls.mk();
    }
}