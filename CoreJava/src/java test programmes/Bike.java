class Bike
{
  final void run()
{
	  System.out.println("running");
	  }
final void run(int a)
    {
	System.out.println(a);
	}
  public static void main(String args[])
	  {
      Bike bk=new Bike();
      bk.run();
	  bk.run(5);
      }
}
