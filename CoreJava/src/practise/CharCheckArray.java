import java.util.Arrays;
class CharCheckArray
{
	public static void main(String[] args)
	{
		String s="edcba";
		char ch[]=s.toCharArray();
          Arrays.sort(ch);
       System.out.println(ch);
	}
}