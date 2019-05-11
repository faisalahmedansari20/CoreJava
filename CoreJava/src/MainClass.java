import java.util.*;
public class MainClass
{
    public static void main(String[] args) 
    {
        System.out.println("Enter your marks");
         
        Scanner sc = new Scanner(System.in);
         
        int marks = sc.nextInt();
         
        assert marks > 35 : "FAIL";
    }
}