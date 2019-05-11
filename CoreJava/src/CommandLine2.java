public class CommandLine2
{
	public static void main(String[] args)
	{ 
          int k=4;
		  int z=3;
			System.out.println("befor k="+k+" z="+z);
			z=k;
		System.out.println("after k="+k+" z="+z);
		String[] argh={"x","y","z"};
		args=argh;
		for(String s:args)
		{
			System.out.println(s);
		}
	}
}