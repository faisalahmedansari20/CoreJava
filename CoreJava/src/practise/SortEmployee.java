import java.util.*;

class Employee implements Comparable<Employee>
{
  String name;
  int id,salary;

   public void setName(String name)
	{
	   this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
    public void setSalary(int i)
	{
		this.salary=i;
	}
	public int getSalary()
	{
		return salary;
	}
     public int compareTo(Employee e)
	{
		 int r=0;
		 if(this.id<e.id)
		{ 
			 r=-1;
		}
		if(this.id>e.id)
		{
								r=1;
		}
		return r;
	}
	public String toString()
	{
		String s=this.id+"_"+this.name+"_"+this.salary;

		return s;
	}
}

class NameComparator implements Comparator<Employee>
{
	public int compare(Employee one,Employee two)
	{
		int r=(one.getName()).compareTo(two.getName());
		return r;
	}

}
  class IdComparator implements Comparator<Employee>
{
	public int compare(Employee one,Employee two)
	{
		int r=0;
		if(one.id<two.id)
		{
			r=-1;
		}
		if(one.id>two.id)
		{
			r=1;
		}
		return r;
	}
}
  

public class SortEmployee
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("malik");
		e1.setSalary(10000);

		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("mk");
		e2.setSalary(20000);

		Employee e3=new Employee();
		e3.setId(3);
		e3.setName("ahmed");
		e3.setSalary(20000);

		ArrayList<Employee> elist=new ArrayList<>();
		 elist.add(e1);
		 elist.add(e2);
		 elist.add(e3);

         Collections.sort(elist,new IdComparator());    //(elist,new NameComparator());
		 System.out.println(elist.toString());
    }
}





