package com.stud;

public class Student {

	/*int id;
	Object obj;
	
	

	public Student(int id) {
		this.id = id;
	}
	*/
	int id;
	
	public Student() {
		System.out.println("in the constructor");
	}
	
	
	static
	{
		System.out.println("in the static block");
	}



	public static void main(String[] arg) {
     
		
		System.out.println("in the main method");
		
		Student student  = new Student();
		Student student1  = new Student();
		
		System.out.println(student.hashCode());
		
		
		
		
		
	/*	 Student himanshi = new Student(1);
		 Student swaty = new Student(2);
		 
		Student himanshi = new Student(2);
//		himanshi.id = 10;
		System.out.println(himanshi.id+"   "+himanshi.obj);
		
		
//		 System.out.println(swaty.id);
*/	}
}
