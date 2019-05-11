class BinaryToDecimal
{
	public static void main(String[] args)
	{
//		String s="1010";
        String s="10011011";
//		int decimal=Integer.parseInt(s,2);
//		System.out.println("binary to deccimal of "+s+"="+decimal);
//
//		String ss=Integer.toBinaryString(decimal);
//		System.out.println("decimal to binary of "+decimal+"="+ss);
//	
	    int octal=Integer.parseInt(s,8);
		System.out.println("binary to octal of "+s+"="+octal);
//
		String octaltobinart=Integer.toOctalString(233);
		System.out.println("octal to binary of "+octal+"="+octaltobinart);
//	
//       int hex=Integer.parseInt(s,16);
//	   System.out.println("binary to hex of "+s+"="+hex);
//
//       String hextobinary=Integer.toHexString(hex);
//	   System.out.println("hex to binary of "+hex+"="+hextobinary);

//      String str="a";
//	  int k=Integer.parseInt(str,16);
//	  System.out.println(k);

    //decimal to octal

	 int it=8;
	String s1=Integer.toOctalString(it);
     System.out.println(s1);








     



	}
}