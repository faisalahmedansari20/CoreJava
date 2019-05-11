import java.util.Scanner;

public class ArmstrongNumber
	{
      public static void main(String[] args)
      {
	       Scanner sc=new Scanner(System.in);
	       
		   int n,sum=0,temp,r=0;

		   System.out.println("insert numpber");
	        n=sc.nextInt();

			temp=n;
			if(n !=0)
		  {
		   while(temp !=0)
		  {
			   r=temp%10;
			   sum=sum+r*r*r;
			   temp=temp/10;
		  }

		   if (n==sum)
		   {
            System.out.println(n+" is a amstrong");
		   }
		   else
		  {
			   System.out.println("number is not amstrong");
		  }
		 }
		 else
		  {
			   System.out.println("number should be greater than 1);
		  }
	 }
	}
