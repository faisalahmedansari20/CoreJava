class CapatilizeWord
{
 public static String capitalWord(String str)
 {
  System.out.println(str);
  String words[]=str.split("\\s");
  System.out.println(words.length);
  String capitilized="";
  for(String w:words)
  {
	  System.out.println("wwww : "+w);
    String first=w.substring(0,1);
	System.out.println("first :"+first);
    String afterfirst=w.substring(1);
	System.out.println("after first :"+afterfirst);

   capitilized+=first.toUpperCase()+afterfirst+" ";
   System.out.println(first.toUpperCase()+""+afterfirst);
   }

   return capitilized.trim();
   }
}

public class TestStringFormatter
{
 public static void main(String[] args)
 {
  System.out.println(CapatilizeWord.capitalWord("wakeel malik people having the money one two three four five"));
  }
}
