class MainBox<M>
{
	M t;
	public void put(M t)
	{
		this.t=t;
	}
	public M get()
	{
		return t;
	}
}
 class MyClass
 {
	 public  void display()
	 {
		 System.out.println("hi how are you");
	 }
 }

  public class MyBoxDem
  {
	  public static void main(String[] args)
	  {
         MainBox<String> obj;
		 obj=new MainBox<String>();
		 obj.put("wakeel");
		 String  s=obj.get();
		 System.out.println(s);

        MainBox<MyClass> obj2;
		obj2=new  MainBox<>();
		MyClass abc=new MyClass();
		obj2.put(abc);

		MyClass o=obj2.get();
		o.display();
	  }
  }
