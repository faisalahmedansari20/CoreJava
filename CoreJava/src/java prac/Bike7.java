class Bike7{  
    int speed;  
static 	int count=0;
	static int coutstatic=0;

	  static 
	{
           coutstatic++;
		  System.out.println("in static block "+coutstatic);
	}
    Bike7()
		{
		System.out.println("hi in constructor");
		System.out.println("speed is "+speed);
		}  
   
       {
		   count++;
		   System.out.println("int the instance block	"+count);
		speed=100;
		}  
       
    public static void main(String args[])
		{ 
		System.out.println("in the main method");
    Bike7 b1=new Bike7();  
    Bike7 b2=new Bike7();  
    }      
}  