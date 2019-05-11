class Sup
{
 private int age;
  Sup(int age)
  {
   this.age=age;
   }

   public int hashCode()
   {
    return age;
    }
    }

    public class Chd
    {
     public static void main(String[] args)
     {
       Sup obj=new Sup(23);
       System.out.println(obj.hashCode());

       int original=System.identityHashCode(obj);
	   System.out.println(original);
	   
	   }
       }
   
