class StringToBytes
{
 public static void main(String[] rags)
 {
  String s="wakeel malik Ahmed";
  char[] ch=s.toCharArray();
 
  byte[] b=s.getBytes();
  for(int i=0;i<b.length;i++)
  {
   System.out.print(": "+ch[i]+"="+b[i]);
   }
}
}