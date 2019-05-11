import java.util.*;

class DuplicatesWithoutCollecton
{
     public  static void mk(String s)
	{
		 String str=s;
		 int m=0;

		 for(int i=0;i<str.length();i++)
		{
			 for(int j=0;j<str.length();j++)
			{
				 if(str.charAt(i)==str.charAt(j) && (i==j))
				{
					 m=i;
				}
              if(str.charAt(i)==str.charAt(j) && (i !=j))
				{
				  System.out.println("duplicate character is "+str.charAt(i)+" and index is "+m+" "+i);
				}
				
								  break;
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("insert the word");
         String s=sc.nextLine();
		mk(s);
	}
}