class StringRotation
{
 public static boolean checkRotation(String str1,String str2)
 {
  if(str1.length()!=str2.length())
  {
   return false;
   }
   String str3=str1+str1;
   if(str3.contains(str2))
     return true;
     else 
     return false;
     }

     public static void main(String[] args)
     {
       String s1="avajava";
       String s2="javaava";

       System.out.println("Checking if a string is rotation of another");
       if(checkRotation(s1,s2))
       {
         System.out.println("yess");
	 }
	 else
	 {
	  System.out.println("no");
	  }
	  }
	  }