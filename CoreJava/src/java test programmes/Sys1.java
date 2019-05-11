import java.util.*;

public class Sys1
 {
  private static int length;

  public static void main(String[] args)
  {

   Scanner reader=new Scanner(System.in);
   System.out.println("enter number to print ");
   int n=reader.nextInt();
   length=n;
   print(1);
   

   }
    private static void	print(int num)
    {
      if(num<=length)
      {
       System.out.print(" :-"+num++);
       print(num);
       }
    }
     
}

