class CallByValue
{
 int data=30;
  
 public void change(int data)
  {
    this.data=data+40;
    }

public static void main(String[] args)
{
  CallByValue cy=new CallByValue();

  System.out.println(cy.data);
  cy.change(10);
  System.out.println(cy.data);
  }
  }