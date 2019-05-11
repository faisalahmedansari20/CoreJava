class FileDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			File file=new File("D:\\sbc.txt");
			if(file.createNewFile())
			{
				System.out.println("new file is created ");
			}
			else
			{
				System.out.println("file is already exist");
			}
		}
		catch (IOException IO)
		{
			IO.printStackTrace();
		}
	}
}
