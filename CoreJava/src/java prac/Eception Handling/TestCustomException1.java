class TestCustomException1
	{  
   static void validate(int age)throws InvalidAgeException
	   {  
         if(age<18)  
          throw new InvalidAgeException("not valid");  
         else  
          System.out.println("welcome to vote");  
       }  
     
       public static void main(String args[])throws Exception	
	   { 
		   try
    	     {
               validate(13); 
			 }
			   catch(Exception m)
				   {
				   System.out.println("Exception occured: "+m);
				   }
                  sdfhdkdkvkhvkhSystem.out.println("rest of the code...");  
        }  
}




class InvalidAgeException extends Exception
	{  
      InvalidAgeException(String s)
	   {  
         super(s);  
       }  
} 