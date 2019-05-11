class Print
{
 public static void main(String[] args)throws Exception	
 {
	 try
	 {
        int i=System.in.read();
  System.out.println((char)i);
		
	 }
	 catch (Exception e)
	 {
		 System.out.println(e);
	 }
  }
}