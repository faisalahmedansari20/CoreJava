class Aa
{
	int i;
	Aa(int z)
	{
		System.out.println("yes how are you="+z);
	}
}
 class Bb extends Aa
 {
	    int j;
	 Bb()
	 {
		 super(10);
		 System.out.println("class Bb Constructor");
     }
 }

 class Mainab
 {
	 public static void main(String[] args)
	 {
		 Bb obj=new Bb();
	 }
 }






