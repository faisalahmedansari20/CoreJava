class TypeCasting<T extends Number>
{
     public void add(Integer t,Integer t1)
	{

		 System.out.println(t+" "+t1);
         System.out.println(t+t1);	
	}


       

}
class Testing10
{
   public static void main(String[] args)
	{
      TypeCasting<Integer> obj=new TypeCasting<Integer>();
	  
	  
	  obj.add(1,3);


	}
	   

}
