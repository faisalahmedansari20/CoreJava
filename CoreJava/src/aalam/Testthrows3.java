import java.io.*;
class MainException{
 void method()throws IOException{
  //System.out.println("device operation performed");
    throw new ArithmeticException("ArithemticException");
 
 
 }
}


class Testthrows3{
   public static void main(String args[])throws IOException{//declare exception
try
{
	  MainException m=new MainException();
     m.method();

}
catch (ArithmeticException e)
{
	System.out.println("comes back to the main "+e);
}
	
    System.out.println("normal flow...");
  }
}
