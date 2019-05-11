class Str
{
	public static void main(String[] args)
	{
		String s1=new String("Ahmed");
		System.out.println(s1.hashCode());
		String s2=s1.intern();
		System.out.println(s2.hashCode());
	}
		
}