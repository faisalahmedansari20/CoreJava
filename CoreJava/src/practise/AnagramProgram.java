import java.util.*;

public class AnagramProgram
{
    static void isAnagram(String s1, String s2)
    {
        //Removing all white spaces from s1 and s2
 
        String copyOfs1 = s1.replaceAll("\\s", "");
 
        String copyOfs2 = s2.replaceAll("\\s", "");
 
        //Initially setting status as true
 
//        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
             System.out.println(s1+" and "+s2+" are not anagram");
  //          status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
 
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
 
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
 
            //Sorting both s1Array and s2Array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Checking whether s1Array and s2Array are equal
 
           boolean status = Arrays.equals(s1Array, s2Array);
          
		  if(status==true)
			{
             System.out.println(s1+" and "+s2+" are  anagram");

			}
		
		}
 
        //Output
// 
//        if(status)
//        {
//            System.out.println(s1+" and "+s2+" are anagrams");
//	    }
//        else
//        {
//            System.out.println(s1+" and "+s2+" are not anagrams");
//        }
    }
 
    public static void main(String[] args)
    {
        isAnagram("Mother In q Law", "Hitler Woman");
 
//        isAnagram("keEp", "peeK");
// 
//        isAnagram("SiLeNt CAT", "LisTen AcT");
// 
//        isAnagram("Debit Card", "Bad Credit");
// 
//        isAnagram("School MASTER", "The ClassROOM");
// 
//        isAnagram("DORMITORY", "Dirty Room");
// 
//        isAnagram("ASTRONOMERS", "NO MORE STARS");
// 
//        isAnagram("Toss", "Shot");
// 
//        isAnagram("joy", "enjoy");
    }
}