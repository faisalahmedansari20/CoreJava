class Car1
{
  String name,color;
}


public class Eq
{
public void mm()
	{

  Car1 cr=new Car1();

  cr.name="ahmed";
  cr.color="white";

  Car1 cr2=new Car1();

  cr2.name="malik";
  cr2.color="black";
  

  System.out.println("checking the equality check :"+cr.name==cr2.name);
  }
   public static void main(String[] args)
	{
	   Eq e=new Eq();
	    e.mm();
	}

}
