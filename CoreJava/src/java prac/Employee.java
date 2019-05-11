import java.lang.*;
public class Employee implements Comparable<Employee>
{
	String name,dept;
	int empid;
	float salary;

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setDept(String dept)
	{ 
		this.dept=dept;
	}
	public String getDept()
	{
		return dept;
	}
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public int getEmpid()
	{
		return empid;
	}
    public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public float getSalary()
	{
		return salary;
	}
	Employee(String name,String dept,int empid,float salary)
	{
		this.name=name;
		this.dept=dept;
		this.empid=empid;
		this.salary=salary;
	}
	Employee()
	{
	}

      public int comapareTo(Employee e)
	{
		  Object o=(Object)this;
		  Employee ee=(Employee)o;
		  System.out.println(ee.empid);
//		  int r=0;
//		  if(this.empid<e.empid)
//		{
//			  r=-1;
//		}
//		if(this.empid>e.empid)
//		{
//			r=1;
//		}
		return 1;
	}
	  public String toString()
	{
		  String s=this.empid+" "+this.name+" "+this.salary;
		  return s;
	}
}
