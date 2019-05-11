import java.util.*;

public class EmployeeSort implements  Comparable<EmployeeSort>
{
	 int id;
	 String name;

	 EmployeeSort(int id,String name)
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

    	@Override
		public int compareTo(EmployeeSort in)
	{
		return new Integer(this.id).compareTo(in.id);
	}

    public static void main(String[] args)
	{
		 EmployeeSort obj1=new EmployeeSort(1,"one");
		 EmployeeSort obj3=new EmployeeSort(3,"three");
     	 EmployeeSort obj2=new EmployeeSort(2,"two");
      
         List<EmployeeSort> ls=new ArrayList<>();

		  ls.add(obj3);
		  ls.add(obj1);
		  ls.add(obj2);

        Collections.sort(ls);
		Iterator<EmployeeSort> itr=ls.iterator();

		while(itr.hasNext())
		{
			 EmployeeSort emp=itr.next();
			 System.out.println(emp.id+" "+emp.name);
		}
	}
}

















