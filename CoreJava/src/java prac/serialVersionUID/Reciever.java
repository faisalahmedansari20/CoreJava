import java.io.*;

class Reciever
{
	public static void main(String[] args)throws Exception
	{

		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i+".."+d2.j+".."+d2.k);
	}
}