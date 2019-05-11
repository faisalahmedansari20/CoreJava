class DiffinReplace
{
	public static void main(String[] args)
	{
		String s="   my          name  is  khan  there  are many   thing  in  the  life ";
		System.out.println(s);

		s=s.replaceAll("\\s","");
		System.out.println(s);
	}
}