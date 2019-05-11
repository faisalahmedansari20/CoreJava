class UpperCaseCharacter
{
 public static void main(String[] args)
 {
  char ch1='a';
  char ch2='B';

  System.out.println(ch1+"is case of  olower Case :"+Character.isUpperCase(ch1));
  System.out.println(ch2+"is case of upperCase    :"+Character.isUpperCase(ch2));
  System.out.println(ch1+"is case of lowerCase    :"+Character.isLowerCase(ch1));
  }
}