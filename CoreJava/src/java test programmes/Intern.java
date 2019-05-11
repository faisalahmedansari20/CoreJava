class Intern 
{
  public static void main(String[] args)
  {

 String s="ahmed";
 String s1=new String("ahmed");

 System.out.println(s==s1);
   
  s1=s1.intern();
  System.out.println(s==s1);

 }

 }

 
