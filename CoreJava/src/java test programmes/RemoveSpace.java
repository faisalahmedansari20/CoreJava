class RemoveSpace
{
 public static void main(String[] args)
 {
  String s="How Are You";

  String nospace=s.replaceAll("\\s","");
  System.out.println(nospace); 
  char[] ch=s.toCharArray();
  StringBuffer stringbuffer=new StringBuffer();
  for(int i=0;i<ch.length;i++)
  {
	if((ch[i]!=' ')&&(ch[i]!='\t'))
	{
	 stringbuffer.append(ch[i]);
	 }
  }
  String str1=stringbuffer.toString();
  System.out.println(str1);
  }
}

 