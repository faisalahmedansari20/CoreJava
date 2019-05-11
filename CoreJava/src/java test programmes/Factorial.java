class Factorial
{
  static int count=0;

  public static void count()
  {
  count++;
  if(count<=5)
   // if(true)
  {
   System.out.println("hello :"+count);
   count();
   }
   }
public static void main(String[] args)
{
  count();
  }
  
}



