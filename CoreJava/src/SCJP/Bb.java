class Pp
{
	Pp()
	{
		System.out.println("in the parent class of Pp");
	}
}



class Aa extends Pp
{
	Aa(int s)
	{
		this();
		System.out.println("in the Aa parameter constructor");
	}
	Aa()
	{
	System.out.println("in the Aa default constructor of Aa");
	}

}
class Bb extends Aa
{
	Bb(int e)
	{
		System.out.println("in the Bb");
	}
 public static void main(String[] args)
	{
	  Bb b=new Bb(33);
	}	
}