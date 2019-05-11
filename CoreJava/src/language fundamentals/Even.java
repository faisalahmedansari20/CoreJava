import java.util.*;

class Even
{
	public static  void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("insert number");

		int p=sc.nextInt();
		int w=p;
		int x=2;

        while(p>1)
		{
            p=p-x;
		}
		if(p==1)
		{
			System.out.println(w+" is a odd number ");
		}
		else
		{
			System.out.println(w+" is a even number ");
		}
	}

}