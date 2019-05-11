class Ooo
{
 static int x=x;
 static int y=2;


 public static void main(String[] args)
 {
  System.out.println(x);// illegal forward reference  because in java code compile from top to down

  System.out.println(x);
  }
}