import java.io.*;  

  class M
	{  
         void method()throws IOException
   	     {  
			 try
			 {
				System.out.println("in the M exception ");
			 }
			 catch (IOException e)
			 {
				 System.out.println("IOException");
			 }
//            throw new IOException("device error");  
         }  
     }  

    class Testthrows4 
	{  
        public static void main(String args[])throws IOException
   	      {
             M m=new M();  
//	          try
//	          {
				m.method();  
//	          }
//	          catch (IOException e)
//	          {
//				  System.out.println("exceptionsds");
//	          }
            System.out.println("normal flow...");  
          }   
    }  