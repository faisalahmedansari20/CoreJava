class Person
	{  
      int id;  
      String name;  
      Person(int id,String name)
		  {  
		    System.out.println("in person");
            this.id=id;  
            this.name=name;  
          }  
      }  

      class Emp extends Person
		  {  
			  int id=3;
			  String name="wakeel";
            float salary;  
            Emp(int id,String name,float salary)
				{  
                 super(id,name);//reusing parent constructor
				System.out.println("in emp");
                 this.salary=salary;  
                }  
                void display() 
		         { 
		           System.out.println(super.id+" "+super.name+" "+salary);
		         }  
         }
	
		 
      class TestSuper5
		  {  
      public static void main(String[] args)
		  {  
           Emp e1=new Emp(1,"ankit",45000f);  
           e1.display();  
      }
	}  
