class Throw
{
 public static  void main(String[] args)
 {
  vlidate(14);
  System.out.println("rest of the code :");
  }
  static void vlidate(int age)
  {
    if(age>=18)
   	System.out.println("Welcome to vote :");
    else 
        throw new ArithmeticException("not valid : for the vote ");


    }
    }
 