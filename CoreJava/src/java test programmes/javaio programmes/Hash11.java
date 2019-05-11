class Hash11
{
	public int id;

   public void mk(Hash11 obj)
	{
	   Class c1=obj.getClass();
	   String s=c1.getName();
//	   System.out.println(s);
       System.out.println(c1.getDeclaredMethods());
	   if(this==obj)
		{
//		   System.out.println("yes");
		}
//	   	  System.out.println(this.hashCode()+" "+obj.hashCode()+" "+obj);
	}
//
//  public int hashCode()
//  {
//   return id;
//   }



 public static void main(String[] args)
 {
   Hash11 hs=new Hash11();
  // System.out.println(hs.hashCode());
 //     System.out.println(hs.hashCode());
//	 System.out.println(hs);
	  hs.mk(hs);
   }
}