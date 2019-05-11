class Checked
{
	public int mk(int p)
	{

		int k=p;
//		System.out.println(k);
        return k;

	}
	public void gk()
	{
		int k=3;
		System.out.println(mk(8));
		System.out.println(k);
	}
	public static void main(String[] args)
	{
		 Checked obj=new Checked();

		// obj.mk();
		 obj.gk();
	}
}