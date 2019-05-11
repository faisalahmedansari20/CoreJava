class MethodReference
{
	public void MethodReference()
	{
		System.out.println("hi");
	}

	public static void main(String[] args)
	{
      MethodReference obj=new MethodReference();
	  obj.MethodReference();
	}
}



/*
import java.util.stream.*;  
import java.util.List;  
import java.util.ArrayList;  
class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class MethodReference {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
           
            Stream<Product> pd=productsList.stream()  
			                 .filter(p -> p.id>3);
//                            .map(x->x.price)
			                pd.forEach(p ->System.out.println(p.name));
//                            .collect(Collectors.toList());  // collecting as list  
//        System.out.println(productPriceList);  
    }  
}  
*/



/*
import java.util.*;  
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class MethodReference {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        productsList.stream().filter(p -> p.price > 30000);

           productsList.forEach(
			            (p) -> system.out.prinltn(p);   
		   );
    }  
}
*/

/*
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }
	
}  
public class MethodReference {  
    public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello ");  
    }  
}  

*/


/*
import java.util.ArrayList;  
import java.util.List;  
public class MethodReference 
	{  
    public static void showList(List<Integer>list)
		{  
        if(!list.isEmpty())
			{  
            list.forEach(System.out::println);  
          }   else System.out.println("list is empty");  
    }  
    public static void main(String[] args) {  
        // An old approach(prior to Java 7) to create a list  
//        List<Integer> list1 = new ArrayList<Integer>();  
//        list1.add(11);  
//        showList(list1);  
//        // Java 7    
        List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type  
        list2.add(12);
		list2.add(13);
        showList(list2);  
        // Compiler infers type of ArrayList, in Java 8  
//        showList(new ArrayList<>();  
    }  
}  
*/



/*
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class MethodReference {  
    public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello");  
    }  
} 
*/


/*
interface Sayable
	{  
    void say();  
   }  
public class MethodReference 
	{  
    public void saySomething()
		{  
        System.out.println("Hello, this is non-static method.");  
        }  
    public static void main(String[] args)
		{  
        MethodReference methodReference = new MethodReference(); // Creating object  
        // Referring non-static method using reference  
            Sayable sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new MethodReference()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
    }  
} 
*/


/*
import java.util.function.BiFunction;  
class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
}  
public class MethodReference
		{  
public static void main(String[] args) 
	{  
BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
int result = adder.apply(10, 20);  
System.out.println(result);  
}  
}  
*/




/*
public class MethodReference implements Runnable
	{  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(MethodReference::ThreadStatus);  
        t2.start();       
    }  
}  
*/

/*
interface Sayable{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        Sayable sayable = MethodReference::saySomething;  
         Calling interface method  
        sayable.say(); 

//         Sayable s=() ->System.out.println("hi");
//		 s.say();
    }  
}  
*/