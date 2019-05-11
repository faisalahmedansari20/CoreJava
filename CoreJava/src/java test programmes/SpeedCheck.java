class SpeedCheck
{
 public static String concatwithString()
 {
  String s="java";

  for(int i=0;i<10000;i++)
  {
	s=s+"linux";
	}
	 return s;
 }

 public static String concatwithBuffer()
 {
   StringBuffer  s1=new StringBuffer("java");
    for(int i=1;i<10000;i++)
    {
      s1.append("linux");
      }
      return s1.toString();
      }

      public static void main(String[] args)
      {
        long starttime=System.currentTimeMillis();
	concatwithString();

	System.out.println("time taken by Concate String :"+(System.currentTimeMillis()-starttime)+"ms");
        starttime=System.currentTimeMillis();
	
        concatwithBuffer();

	System.out.println("time taken by Stringbuffer is :"+(System.currentTimeMillis()-starttime)+"ms");
    }
}
  


