class CheckingHashCode
{
	public static void main(String[] args)
	{
		String s="abc";
		String s1="abc";
		System.out.println("s==s1 "+s==s1);
		System.out.println(" s.equals(s1)"+s.equals(s1));

       System.out.println(s.hashCode()+" "+s1.hashCode());	
		   }
}