import java.util.*;  
class Student implements Comparable<Student>{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
   public int compareTo(Student s)
	  {
		int r=0;
		if(this.age<s.age)
		  {
			r=-1;
		  }
		  if(this.age>s.age)
		  {
			  r=1;
		  }
		  return r;
	  }
     public String toString()
	{
		String s=age+" "+name+" "+rollno;
		return s;
	}
}
public class TestCollection3
	{  
 public static void main(String args[])
	 {  
  //Creating user-def1ined class objects  
    Student s2=new Student(102,"Ravi",21);  
      Student s1=new Student(101,"Sonoo",23);  
	Student s3=new Student(103,"Hanumat",25);  
  //creating arraylist  
  ArrayList<Student> al=new ArrayList<>();  
  al.add(s2);//adding Student class object  
  al.add(s1);  
  al.add(s3);
  Collections.sort(al);
   for(Student st:al)
		 {
	 System.out.println(st);
		 }
  //Getting Iterator  
//  Iterator itr=al.iterator();  
//  //traversing elements of ArrayList object  
//  while(itr.hasNext()){  
//    Student st=(Student)itr.next();  
//    System.out.println(st.rollno+" "+st.name+" "+st.age);  
//  }  
 }  
}  