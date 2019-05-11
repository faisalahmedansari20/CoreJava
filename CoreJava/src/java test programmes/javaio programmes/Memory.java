class Memory
{
 public void mk()
	 {
	 //   gk();
		 System.out.println("yes");
	 }

	 public void gk()
	 {
         mk();
		 System.out.println("no");
	 }
	

	 public static void main(String[] args)
	 {
		 new Memory().gk();
		 System.out.println(new Memory().hashCode());
	 }
 }

  