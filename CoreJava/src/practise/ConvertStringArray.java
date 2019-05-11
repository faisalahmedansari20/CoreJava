import java.util.*;
class ConvertStringArray
{
	public static void main(String[] args)
	{
		String s="ab cd ef  gh";
		String[] str=s.split("\\s");
        System.out.println(str.length);
        System.out.println((str[1]).length());
        int t=(str[1]).length();
		String ss=str[1];

		System.out.println(str[0]);

//		System.out.println(Arrays.toString(str));
	}
}