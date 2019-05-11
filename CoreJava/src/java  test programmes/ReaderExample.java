import java.io.*;  
public class ReaderExample {  
    public static void main(String[] args) {  
        try {  
            Reader reader = new FileReader("D:\\testout.txt");  
//            int data = reader.read();
              int data;
            while ((data=reader.read()) != -1) {  
                System.out.print((char) data);  
//                data = reader.read();  
            }  
            reader.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
    }  
}  