import java.util.*;

public class EmployeeSort1 
{
	 int id;
	 String name;

	 EmployeeSort1(int id,String name)
	{
		  this.id=id;
		  this.name=name;
	}
	 public void setId(int id)
	{
		  this.id=id;
	}
	public int getId()
	{
		 return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		 return name;
	}

//    	@Override
//		public int compareTo(EmployeeSort1 in)
//	{
//		return new Integer(this.id).compareTo(in.id);
//	}

    

    public static void main(String[] args)
	{
		 EmployeeSort1 obj1=new EmployeeSort1(1,"A");
		 EmployeeSort1 obj3=new EmployeeSort1(3,"C");
     	 EmployeeSort1 obj2=new EmployeeSort1(2,"B");
      
         List<EmployeeSort1> ls=new ArrayList<>();

		  ls.add(obj3);
		  ls.add(obj1);
		  ls.add(obj2);

        Collections.sort(ls,new EmployeeSort12());
		Iterator<EmployeeSort1> itr=ls.iterator();

		while(itr.hasNext())
		{
			 EmployeeSort1 emp=itr.next();
			 System.out.println(emp.id+" "+emp.name);
		}
	}
}















