import java.util.*;

class Input
{
 public static void  main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter First Number :");
  int firstNumber=s.nextInt();
  System.out.println("Enter Second Number :");
  int secondNumber=s.nextInt();

  int sum=firstNumber+secondNumber;

  System.out.println("total number "+sum);
  }
}