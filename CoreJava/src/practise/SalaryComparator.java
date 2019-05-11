import java.util.*;

class SalaryComparator implements Comparator<Employee>
  {
	  public int compare(Employee one ,Employee two)
	  {
		  int r=0;
         if(one.salary<two.salary)
		  {
			 r=-1;
		  }
		  if(one.salary>two.salary)
		  {
			  r=1;
		  }
		  return r;

	  }

  }