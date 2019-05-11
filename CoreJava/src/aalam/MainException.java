import java.io.*;
class MainException{
 void method()throws IOException{
  System.out.println("device operation performed");
 }
}


class Testthrows3{
   public static void main(String args[])throws IOException{//declare exception
     MainException m=new MainException();
     m.method();

    System.out.println("normal flow...");
  }
}
