import java.util.*;
public class PermutationsOfString 
{   
	static public void StringPermutation(String input)
	{
		StringPermutation("", input);
	}
	
	private static void StringPermutation(String permutation, String input)
	{
				System.out.println(" before permu ="+permutation+" before input ="+input);

		if(input.length() == 0)
		{
//			System.out.println(" in ");
			System.out.println(" permutation ="+permutation);
		}
		else
		{
			for (int i = 0; i < input.length(); i++)
			{	
				System.out.println("input.length()="+input.length()+" and i="+i+" and after permu ="+permutation+input.charAt(i)+" and after input ="+input.substring(0, i)+input.substring(i+1, input.length()));
				StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
         StringPermutation(s);
//		StringPermutation("JSP");
	}	
}