public class RemoveChar {  
    public static void main(String[] args) {  
              String str = "India is my country";
			      char[] ch=str.toCharArray();
                 
				   System.out.println(str.substring(1)); 
				   System.out.println(str.substring(1,3)); 

   //           System.out.println(charRemoveAt(str, 7));  
           }  
           public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
}  