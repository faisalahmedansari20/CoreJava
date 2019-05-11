class StringLenngth
{
	public static void main(String[] args)
	{
		String s="abcdef ghi";


		System.out.println("length of s="+s.length());

		char[] ch=s.toCharArray();
		System.out.println("char array length ch="+ch.length);
        
		System.out.println("char at String s="+s.charAt(9));
        for(int k=0;k<ch.length;k++)
		{
         System.out.println("charAt "+k+" is="+ch[k]);
		}
	}
}