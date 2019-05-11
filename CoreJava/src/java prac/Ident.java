import java.util.*;

class Ident
{
	Integer i;

	Ident(Integer i)
	{
		this.i=i;
	}

//	public String toString()
//	{
//		return this.i+" ";
//	}

	public static void main(String[] args)
	{
		Map mp=new HashMap();

       Integer i1=new Integer(10);
       Integer i2=new Integer(10);

//          Ident i1=new Ident(10);
//		  Ident i2=new Ident(10);


		mp.put(i1,"A");
		mp.put(i2,"B");
		System.out.println(mp);
	}


}