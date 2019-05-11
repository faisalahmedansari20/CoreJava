import java.io.*;
public class TestException3 {

	public static void main(String[] args) {
		try{
		bar();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		try
		{
		foo();
		}
		catch (Exception e)
		{
			System.out.println("run");
		}
	}

	public static void bar(){
		
	}
	
	public static void foo() throws Exception{
   try
   {
	 throw new IOException();		
   }
   catch (Exception e)
   {
			System.out.println("run in main");
   }
  
	}
}