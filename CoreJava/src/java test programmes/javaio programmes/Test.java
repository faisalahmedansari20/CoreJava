import java.lang.reflect.Field;
import java.lang.reflect.Method;


class Student
{
 private String name;
 private  int roll_no;

 public String getName()
 {
  return name;
  }

  public void setName(String name)
  {
   this.name=name;
   }

   public int getRollno()
   {
    return roll_no;
    }

    public void setRollno(int roll_no)
    {
     this.roll_no=roll_no;
     }
     }

     public class Test
     {
      public static void main(String[] args)
      {
       Student s1=new Student();
        
       System.out.println(String.class.getClassLoader());
	   System.out.println(Test.class.getClassLoader());


       Class c1=s1.getClass();
       System.out.println("class Name: "+c1.getName());

       Method m[]=c1.getDeclaredMethods();
       for(Method method:m)
       {
        System.out.print("Methods Name :("+method.getName()+") ** : ");
	}
		    System.out.println();


	Field f[]=c1.getDeclaredFields();
	 for(Field field:f)
	 {
	  System.out.print("Fields Names:("+field.getName()+") field name:");
	  }
	  }
}