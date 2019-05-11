import java.util.*;
import java.lang.*;

class Employees implements Comparable<Employees>
{
 String name,dept,designation;
 int empid;

  public void setEmpid(int empid)
  {
   this.empid=empid;
   }

   public  int setEmpid()
   {
    return empid;
    }

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

    public void setDesignation(String designation)
    {
      this.designation=designation;
     }

     public String getDesignation()
     {
      return designation;
      }
    
       public int compareTo(Employees e)
       {
        int r=0;
	if(this.empid<e.empid)
	{
	 r=-1;
	 }
	 if(this.empid>e.empid)
	 {
           r=1;
	   }
	    return r;
	    }

	    public String toString()
	    {
	     String x=this.name+" "+this.dept+" "+this.designation+" "+this.empid;

	       return x;
	       }

	       }



















   


