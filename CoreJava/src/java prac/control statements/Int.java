class Int
{
	public static void main(String[] args)
	{
//		Thread t=new Thread(() -> printMessage());
		Thread t=new Thread(Int::printMessage(4));

		t.start();
	}

	public static void printMessage(int i)
	{
		System.out.println("in the lambda expression "+i);
	}
}