class Arithmetic1 
{
 public static void main(String[] args)
 {
  String s="hi how are you";
 
   for(int k=0;k<s.length();k++)
	 {
	    System.out.print(s.charAt(k));
	 }

//  System.out.println("Stirng charAt : "+s.charAt(0));

  char[] ch=s.toCharArray();
  //System.out.println("char At : "+ch[0]);
   System.out.println();
   for(int i=0;i<ch.length;i++)
	 {
	    System.out.print(ch[i]);
	 }

  System.out.println("\n"+"String length :"+s.length());
  System.out.println("char array length :"+ch.length);
  }
}