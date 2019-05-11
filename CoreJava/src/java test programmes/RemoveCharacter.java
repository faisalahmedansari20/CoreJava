class RemoveCharacter
{
 public static String remove(String s,int p)
 {
	 System.out.println(s.substring(p+1).trim());
  return s.substring(0,p)+s.substring(p+1);
  }

  public static void main(String[] args)
  {
   String s1="mk is developer";
   String ss=remove(s1,4);
   System.out.println(ss);
   }
}
