class HashCodeChecking
{
	String name;
	int  i;

   HashCodeChecking(String name,int i)
	{
	   this.name=name;
	   this.i=i;

	   System.out.println(name+" "+i);
	}

	   public int hashCode()
	   {
	   	return name.hashCode()+i;
	   }

	     public boolean equals(Object o) 
	     	{
              HashCodeChecking m=(HashCodeChecking)o; return m.name.equals(this.name) && m.i==this.i;
	        }

               public String toString()
	            {
	              return this.name+" "+this.i;
	            }
}

 public class MainClass
 {
	 public static void main(String[] args)
	 {
      HashCodeChecking obj1= new HashCodeChecking("mw",1);
      HashCodeChecking obj2= new HashCodeChecking("mw",1);
 
//       System.out.println(obj1.hashCode());
//       System.out.println(obj2.hashCode());
//       System.out.println(obj1.equals(obj2));

	   System.out.println(obj1.toString());
	   System.out.println(obj2.toString());

	 }
 }





