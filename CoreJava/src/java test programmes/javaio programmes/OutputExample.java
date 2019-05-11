import java.io.*;  
public class OutputExample
{  
    public static void main(String[] args) throws IOException 
    {  
        FileOutputStream file = new FileOutputStream("D:\\java test programmes\\javaio programmes\\new2.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        String s="hi gggggggg";
		byte[] b=s.getBytes();
		data.write(b);
//        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  