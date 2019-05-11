class Operation{  
static int data1=50;  
 static int data;
 void change(int data){  
 data1=data+100;//changes will be in the local variable only  

 }  
     
 public static void main(String args[]){  
   Operation op=new Operation();  
  
     System.out.println("before change "+op.data1);  
     op.change(500);  
	 System.out.println("after change "+op.data1);  


//   System.out.println("before change "+op.data1);  
//   op.change(500);  
//   System.out.println("after change "+op.data1);  
//  System.out.println("after change data "+data);
 }  
}  