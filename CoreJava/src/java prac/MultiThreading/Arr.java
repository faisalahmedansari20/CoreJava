class Arr
{
	int i;
	String name;
        
		Arr(String name,int i)
	   {
			this.name=name;
			this.i=i;
	   }
	   public String toString()
	{
		   return name+" "+i;
	}

	public static void main(String[] args)
	{
		Object[] obj=new Object[4];

		String s1=new String("str");
		Integer i1=new Integer(10);
		Character r=new Character('a');
	    Arr ar=new Arr("sami",39);

		obj[0]=s1;
		obj[1]=i1;
		obj[2]=r;
		obj[3]=ar;

          for(Object ob:obj)
     		{
             System.out.println(ob);
			}

//		System.out.println("inserted succesfully");

//        for(int i=0;i<obj.length;i++)
//		{
//       System.out.println(obj[i]);
//		}
	}

}