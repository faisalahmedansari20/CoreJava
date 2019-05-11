import java.io.*;
class FileDemo1 
{
	public static void main(String[] args) 
	{
		try
		{
			File file=new File("D:\\ sbc.pdf");
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
