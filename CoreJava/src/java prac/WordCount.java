class WordCount
{
	public static void main(String[] args)
	{
		int count=0;
		String s=" there hi how are you where are  you";
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
			if( ( (i>0)&& (ch[i]!=' ') && (ch[i-1]==' ') ) || ( (ch[0]!=' ') && (i==0) ) )
			{
				count++;
			}
        }
					System.out.println(count);
	}
}