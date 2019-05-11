class GetChars
{
 public static void main(String[] args)
 {
  String str="hello javatpoint  how are you";
  char[] ch=new char[10];
  try
  {
    str.getChars(6,16,ch,0);
    System.out.println(ch);
    }

    catch(Exception e)
    {
     System.out.println(e);
    }
    }
}