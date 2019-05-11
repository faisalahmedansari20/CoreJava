class GetChars
{
	public static void main(String[] args)
	{
		String s="hi how are you";
//		byte[] bt=s.getBytes();
//        char[] bt	=s.toCharArray();
		   char[] bt=new char[8];
           s.getChars(2,10,bt,0);
		   System.out.print(bt);

		for(int i=0;i<bt.length;i++)
		{
//			System.out.print(" "+bt[i]);
		}
	}
}