public class ForEachLoop
{
    public static void main(String[] args)
    {
        //Two Dimensional Array
        int[][] twoDArray = { {1, 2, 3, 4}, {5, 6, 7, 8} };
       
	    System.out.println(twoDArray.length);
   
        //iterating every element of twoDArray using for-each loop
        for (int[] oneDArray : twoDArray)
        {
            System.out.print("[");
 
            //iterating every element of oneDArray using for-each loop
            for (int i : oneDArray)
            {
                System.out.print(i+"\t");
            }
            System.out.println("]");
        }
	}
}
   