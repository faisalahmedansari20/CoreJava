class PassByValue
{
 public static void mk(int number)
	{
	  number++;
	  System.out.println("number="+number);
	}
	public static void main(String[] args)
	{
       int num=4;
	   mk(num);
	   System.out.println("num in main method ="+num);
	}
}