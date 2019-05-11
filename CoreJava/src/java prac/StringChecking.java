class StringChecking
{
	public static void main(String[] args)
	{
		String s="xyz";
		String s1="xyz";
	    String s2=new String("xyz");
		
		System.out.println("s==s2 "+s==s2);

		System.out.println("s==s1 "+s==s1);

		System.out.println("s="+s.hashCode()+" s1="+s1.hashCode()+" s2="+s2.hashCode());
	}
}