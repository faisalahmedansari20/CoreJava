import java.util.*;
import java.util.regex.*;

class  ConvertStringToArray
{ 
   public String mk(String str)
	{
   String line="hi how are you my name is khan";
   String[] words=line.split(" ");
   System.out.println(Arrays.toString(words));
   Pattern pattern=Pattern.compile(" ");
   words=Pattern.split(line);

   return   Arrays.toString(words);

	}

  public static void main(String[] args)
  {
    ConvertStringToArray c=new ConvertStringToArray();  
  System.out.println(c.mk("hi how are you where are you"));
  }
  }
                                    
 