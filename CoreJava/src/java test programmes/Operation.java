class Operation
{
 int data=50;

  void change(Operation op)
  {
    op.data=data+40;
    }

    public static void main(String[] args)
    {
     Operation opr=new Operation();

     System.out.println("befor changing the data : "+opr.data);
     
      opr.change(opr);

      System.out.println("after changing the data : "+opr.data);
      }
}