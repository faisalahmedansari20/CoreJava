import java.util.*;

class Hash
{
	public static void main(String[] args)
	{
		try
		{
		Hashtable hs=new Hashtable();
		hs.put(new Temp1(5),"A");
		hs.put(new Temp1(2),"B");
		hs.put(new Temp1(6),"C");
		hs.put(new Temp1(15),"D");
		hs.put(new Temp1(23),"E");
		hs.put(new Temp1(16),"F");
		hs.put(new Temp1(10),"F");
		hs.put("Aalik","Malik");

		System.out.println(hs);
			char c='M';
		System.out.println((int)c);


		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


}




class Temp1
{
	int i;
	Temp1(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}

}