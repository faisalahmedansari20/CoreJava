class ObjectChecking
{
//	int a;
//	String name;
//
//	ObjectChecking(int a,String name)
//	{
//		this.a=a;
//		this.name=name;
//	System.out.println(a+" "+name);
//
//	}

//	int a;
//	String s;
//
//	public static void main(String[] args)
//	{
//		ObjectChecking obj=new ObjectChecking();
//
//	  System.out.println(obj.a);
//	  System.out.println(obj.s);
//
//	   int rollno;
//	   String name;
//
//	   void insertRecord(int r,String n)
//	{
//		   rollno=r;
//		   name=n;
//	}
//	
//	void displayInformation()
//	{
//		System.out.println(rollno+" "+name);
//	}
//
//	public static void main(String[] args)
//	{
//        ObjectChecking obj1=new ObjectChecking(),obj2=new ObjectChecking() ;
////    	ObjectChecking obj2=new ObjectChecking();
//    
//    	obj1.insertRecord(111,"ahmed");
//    	obj2.insertRecord(222,"wakeel");
//    
////    	obj1.displayInformation();
////    	obj2.displayInformation();
//    	
//		System.out.println(obj1.name+" "+obj1.rollno);
//		System.out.println(obj2.name+" "+obj2.rollno);


//         public static void main(String[] args)
//	     {
//			 ObjectChecking obj1=new ObjectChecking(10,"wakeel malik");
//             obj1.ObjectChecking(20,"ahmed");

//               int id ;
//			   String name;
//
//			   public static void main(String[] args)
//	{
//				   System.out.println(new ObjectChecking().id);
//                   System.out.println(new ObjectChecking().name);
               
			   int id;
			   String name;


              ObjectChecking(int id,String name)
	          {
                 this.id=id;
				 this.name=name;
		        }
				
                 ObjectChecking(){}

				 public void display()
	{ 
					 System.out.println(id+" "+name);
	}

				 public static void main(String[] args)
                	{
                        ObjectChecking obj1=new ObjectChecking(202,"ahmed");
                        ObjectChecking obj2=new ObjectChecking();
						
						obj2.id=obj1.id;
						obj2.name=obj1.name;
						
				        obj1.display();
						obj2.display();


                	}
}









