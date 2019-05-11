class ReverseString
{
 public static void main(String[] args)
	{
	 String s="java developer in java ";

	 char[] ch=s.toCharArray();
	 char[] result=new char[ch.length];

    for(int i=0;i<ch.length;i++)
		{
		  if(ch[i]==' ')
			{
			  result[i]=' ';
			}
        }

		int j=result.length-1;

		for(int k=0;k<ch.length;k++)
		{
			if(ch[i]!=' ')
			{
				if(result[j]===' ')
				{
					j--;
				}
				result[j]=inputArray[i];
				j--;
			}

		}



      


}