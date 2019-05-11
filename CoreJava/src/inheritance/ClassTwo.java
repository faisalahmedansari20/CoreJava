class ClassOne
{
    static int i = 111;
     
    int j = 222;
     
    {
        i = i++ - ++j;
    }
}
 
class ClassTwo extends ClassOne
{
    {
        j = i-- + --j;
    }
    	public void mk()
	{
		System.out.println("i="+i+" and j="+j);
	}

	public static void main(String[] args)
	{
		new ClassTwo().mk();
	}
}


