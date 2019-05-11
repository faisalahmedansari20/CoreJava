class CapitalizedWord
{
	public static void main(String[] args)
	{
		String s="My name is khan in india";
		String capital="";

		String[] str=s.split("\\s");
        System.out.println(s);
		for(String w:str)
		{
			String upper=w.substring(0,1);
			String end=w.substring(1);

			capital+=upper.toUpperCase()+end.toLowerCase()+" ";
		}
		System.out.println(capital);
	}
}