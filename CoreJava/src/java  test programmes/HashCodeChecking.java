class HashCodeChecking
{
	String name;
	int  i;

   HashCodeChecking(String name,int i)
	{
	   this.name=name;
	   this.i=i;
	}
}

 public class MainClass
 {
	 public static void main(String[] args)
	 {
      HashCodeChecking obj1= new HashCodeChecking("mw",1);
      HashCodeChecking obj2= new HashCodeChecking("mw",1);

	 }
 }