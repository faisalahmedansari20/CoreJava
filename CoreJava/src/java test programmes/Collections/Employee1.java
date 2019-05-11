class Employee1
{
 public static void main(String[] args)
 {
  Employee1 obj1=new Employee1();
  Employee1 obj2=new Employee1();
  Employee1 obj3=(Employee1)obj1;
  Employee1 obj4=(Employee1)obj2;

  System.out.println(obj1.equals(obj3));
  System.out.println(obj2.equals(obj4));

  System.out.println(obj1+" ="+obj3);
  System.out.println(obj2+" ="+obj4);

  System.out.println(obj1.hashCode()+" ="+obj3.hashCode());
  System.out.println(obj2.hashCode()+" ="+obj4.hashCode());


 }
}