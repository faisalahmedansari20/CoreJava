import java.io.*;

class CreatClass
{
	public static void main(String[] args)throws IOException
	{
		
			File f=new File("E:\\abc.txt");
			FileWriter fw=new FileWriter(f);
			fw.write("in india");
			fw.close();

		
		
	}
}