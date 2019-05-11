class HashingCheck
{
	public int i;
	public String name;

	HashingCheck(int i,String name)
	{
		this.i=i;
		this.name=name;
	}

	public void objCHeck(Object o1,Object o2)
    {
		 System.out.println("yes i :"+o1+" "+o1.hashCode()+" : "+this+" :"+this.hashCode());
         System.out.println("yes i :"+o2+" "+o2.hashCode()+"  :"+this+" :"+this.hashCode());
	}


 public static void main(String[] args)
 {
  HashingCheck obj1=new HashingCheck(1,"yes");
  HashingCheck obj2=new HashingCheck(1,"yes");

      obj2.objCHeck(obj1,obj2);

   System.out.println(obj1.hashCode()+" "+obj2.hashCode());
   System.out.println(obj1+" "+obj2);


  if(obj1.hashCode()==obj2.hashCode())
  {
	  System.out.println("entera here ");
   if(obj1.equals(obj2))
   {
     System.out.println("both are equals");
     }
     }
	 else
	 {
		  System.out.println("not equals");
     }
 }
}