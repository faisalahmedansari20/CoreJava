import java.util.*;

class SortedEmployee
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.setEmpid(1);
		e1.setName("Tom");
		e1.setDept("java");
        e1.setSalary(33.44f);

        Employee e2=new Employee();
		e2.setEmpid(2);
		e2.setName("mac");
		e2.setDept("Html");
        e2.setSalary(33.44f);

		Employee e3=new Employee();
		e3.setEmpid(3);
		e3.setName("sam");
		e3.setDept("linux");
        e3.setSalary(33.44f);

		Employee e4=new Employee();
		e4.setEmpid(4);
		e4.setName("mikky");
		e4.setDept("script");
        e4.setSalary(333.44f);

		Employee e5=new Employee();
		e5.setEmpid(5);
		e5.setName("john");
		e5.setDept("php");
        e5.setSalary(233.44f);

//      TreeSet t=new TreeSet();
         List<Employee> elist=new ArrayList<>();
		 elist.add(e1);
		 elist.add(e5);
		 elist.add(e4);
		 elist.add(e3);
		 elist.add(e2);

      Collections.sort(elist);

	
	
	}





}