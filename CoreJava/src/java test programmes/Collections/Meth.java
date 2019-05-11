class Meth
{
//    public void gk()
//	{
//      int i=1,q=2;
//	  System.out.println(i<q);
//
//	}

	public int mk(int k,int p)
	{
		return (k<p)? -1 : (k>p)?1:0;
	}
 public static void main(String[] args)
	{

    Meth obj=new Meth();
	//obj.gk();
    System.out.println(obj.mk(2,3));
	}
}
	  