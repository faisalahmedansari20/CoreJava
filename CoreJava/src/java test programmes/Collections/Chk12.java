import java.math.*;
class Chk12
{
  public void mk()
  {
   BigDecimal i=new BigDecimal("2.0");
   BigDecimal k=new BigDecimal("2.00");

   System.out.println(i.equals(k));
   System.out.println(i.compareTo(k));
   }

public static void main(String[] args)
{
 Chk12 obj=new Chk12();

  obj.mk();
  }
}