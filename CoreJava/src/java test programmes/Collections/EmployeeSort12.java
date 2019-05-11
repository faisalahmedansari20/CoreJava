import java.util.*;
  class EmployeeSort12 implements Comparator<EmployeeSort1>
  {
       @Override
		   public int compare(EmployeeSort1 emp1,EmployeeSort1 emp2)
	  {
		    return emp1.getName().compareTo(emp2.getName());
	  }
  }
  
