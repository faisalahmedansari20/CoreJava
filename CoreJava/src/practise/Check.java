class Check
{
 
 
 public static void start() throws  RuntimeException{
    throw new RuntimeException("Not able to Start");
 }

 public static void main(String args[]) {
    try {
          start();
    }
	
	catch (Exception ex) {
            ex.printStackTrace();
    }
	
 }

}
