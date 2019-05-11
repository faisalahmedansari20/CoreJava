import java.util.*;

class SortEmployee
{
 public static void main(String[] args)
 {
  Employees emp1=new Employees();

   emp1.setName("malik");
   emp1.setDept("IT");
   emp1.setDesignation("B.E");
   emp1.setEmpid(1);


  Employees emp2=new Employees();

   emp2.setName("Ahmed");
   emp2.setDept("ETRX");
   emp2.setDesignation("M.E");
   emp2.setEmpid(2);


   Employees emp3=new Employees();

   emp3.setName("Sami");
   emp3.setDept("EXTC");
   emp3.setDesignation("MCA");
   emp3.setEmpid(3);

  
  ArrayList<Employees> elist=new ArrayList<>();
  elist.add(emp3);
  elist.add(emp2);
  elist.add(emp1);

  System.out.println(elist);

  Collections.sort(elist);
  System.out.println(elist);
  Collections.sort(elist,new NameComparator());
  System.out.println(elist);

  
  System.out.println(Collections.max(elist));
}

}