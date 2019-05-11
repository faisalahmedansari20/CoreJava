import java.io.*;

public class Example1{  
   void checkAge(int age)// throws IOException,ArithmeticException
	   {  
	if(age<18)  
	   throw new ArithmeticException("Not Eligible for voting");  
	else  
	   System.out.println("Eligible for voting");  
   }  
   public static void main(String args[]){  
	Example1 obj = new Example1();
//	try
//	{
	obj.checkAge(13);  
//	}
//	catch (Exception e)
//	{
//	   System.out.println("Eligible for voting in the main method ");  
//	}
	System.out.println("End Of Program");  
   }  
}