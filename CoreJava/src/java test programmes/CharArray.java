class CharArray
{
 public static void main(String[] args)
 {
   String s="java developer";
   char[] ch=s.toCharArray();

   for(int i=0;i<ch.length;i++)
   {
	if((ch[i]!=' ')&&(ch[i]!=('\t')))
	   {
       System.out.print(ch[i]);
	   }
	}
}
}