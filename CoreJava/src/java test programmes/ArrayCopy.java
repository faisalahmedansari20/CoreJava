class ArrayCopy
{
 public static void main(String[] args)
 {
   char[] copyFrom={'w','a','k','e','e','l'};
   char[] copyTo=new char[10];

   System.arraycopy(copyFrom,1,copyTo,0,4);
   System.out.println(new String(copyTo));

   }
}
