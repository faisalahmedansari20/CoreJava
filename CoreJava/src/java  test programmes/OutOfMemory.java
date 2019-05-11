class OutOfMemory
{
	public static void main(String[] args)
	{
		char[] ch=new char[200000000];
		String s= new String(ch);
		System.out.println(s.length());
	   
	   StringBuilder sb=new StringBuilder(s);
	   System.out.println(sb);

	// 2*200000000+2
	}
}