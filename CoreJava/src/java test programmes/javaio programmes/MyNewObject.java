class MyNewObject
{
	MyNewObject()
	{
     MyNewObject obj=new MyNewObject();
	}
 public void mk()
 {
	 System.out.println("hi");
 }

 public static void main(String[] args)
	{
     MyNewObject obj=new MyNewObject();
	 obj.mk();
	}
}