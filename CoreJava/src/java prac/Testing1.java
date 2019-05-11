
class Testing1
{
	int i;
	String s;



	  Testing1(int i)
	{
		  this.i=i;
//		  this.s=s;
	}

	

	public static void main(String[] args)
	{
		Testing1 obj1=new Testing1(1);
		Testing1 obj2=new Testing1(1);
          

		      String s1="malik";
          	 String s2=new String("malik");
	   System.out.println(s1.hashCode()+" "+s2.hashCode());
	   System.out.println(s1.hashCode()==s2.hashCode());

		 
		 

//		System.out.println("obj1="+obj1.hashCode());
//		System.out.println("obj2="+obj2.hashCode());
//		System.out.println(obj1.equals(obj2));
	}


}