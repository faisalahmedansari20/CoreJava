import java.io.*;    
public class DataStreamExample11 
{  
  public static void main(String[] args) throws IOException 
  {  
    InputStream input = new FileInputStream("D:\\java test programmes\\javaio programmes\\new2.txt");  
    DataInputStream inst = new DataInputStream(input);  
//    int count = input.available();  
  //  byte[] ary = new byte[count];  
    //inst.read(ary);  
      int k=0;

	  while((k=inst.read())!=-1)
	  {
		  System.out.print((char)k);
	  }
	  inst.close();
    


//    for (byte bt : ary) {  
//      char k = (char) bt;  
//      System.out.print(k+"-");  
//    }  
  }  
}  