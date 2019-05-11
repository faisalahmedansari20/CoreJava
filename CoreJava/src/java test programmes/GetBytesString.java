class GetBytesString
{
 public static void main(String[] args)
 {
  String s="My name is khan";
   char[] ch=s.toCharArray();
  byte[] b=s.getBytes();

//  for(int i=0;i<b.length;i++)
    for(char t:ch)
  {
     System.out.print(":"+t);
//   System.out.print(" :"+b[i]);
   }
 
     System.out.println("");
       for(byte bt:b)
  {
     System.out.print(":"+bt);
//   System.out.print(" :"+b[i]);
   }

}
}