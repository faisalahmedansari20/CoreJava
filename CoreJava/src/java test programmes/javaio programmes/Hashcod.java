class Hashcod
{
   public boolean equals(Object obj)
	{
       return (this==obj);
	}
 public static void main(String[] args)
 { 
   int i=90;
//   System.out.println(Integer.toString(i).hashCode());
    
	  Hashcod obj1=new Hashcod();
	  Hashcod obj2=new Hashcod();

//	  System.out.println(obj1==obj2);
//	  System.out.println(obj1.equals(obj2));
//	  System.out.println(obj1);
//	  System.out.println(obj2);
	System.out.println(obj1.equals(obj1));

   }
}