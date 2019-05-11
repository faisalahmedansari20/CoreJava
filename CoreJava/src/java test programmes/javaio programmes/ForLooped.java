class ForLooped
{
 String s="yes";
 public void mk()
 {
  for(double k=1;k<10000000;k++)
  {
  s=s+k;
   System.out.print(" :"+s);
   }
   }
   public static void main(String[] args)
	{
         ForLooped f=new ForLooped();
		    f.mk();
	}
}
