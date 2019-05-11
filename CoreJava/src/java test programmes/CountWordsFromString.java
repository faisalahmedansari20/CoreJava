class CountWordsFromString
{
 public static void main(String[] args)
 {
  String s="hi how are you i";
  System.out.println(s.length());
  System.out.println(s.charAt(s.length()-1));
   int count=1;

  for(int k=0;k<s.length()-1;k++)
  {
  // if((s.charAt(k)==' ')&&(s.charAt(k +1)!=' '))
  if((s.charAt(k)==' ')&&(s.charAt(k+1)!=' '))
   {
    count++;
    }
    }
    System.out.println("number of words :"+count);
    }
    }