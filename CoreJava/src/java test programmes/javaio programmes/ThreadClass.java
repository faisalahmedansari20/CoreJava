class ThreadClass extends Thread
{
 public void mk()
 {
  for(int i=1;i<5;i++)
	 {
	  System.out.println(this.getName());
	 }
 }
	 public static void main(String[] args)
	 {

		 ThreadClass obj=new ThreadClass();

		  obj.mk();
	 }
 }