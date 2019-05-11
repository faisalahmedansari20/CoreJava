class StringPoolCheck
{
	public static void main(String[] args)
	{ 
        String s2=new String("yes");
		String s="yes";
//		String s1="yes";

		System.out.println(s.hashCode()+"="+s2.hashCode()+" "+s2==s);
	}
}