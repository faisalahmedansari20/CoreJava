public class ForEachLoop1
{
    public static void main(String[] args)
    {
        //Two Dimensional Array
        int[] twoDArray =  {1, 2, 3, 4,5, 6, 7, 8} ;
       
	    System.out.println(twoDArray.length);
   
        //iterating every element of twoDArray using for-each loop
            for (int i : twoDArray)
            {
                System.out.print(" "+i);
            }
        }
	}
	
   