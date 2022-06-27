import java.util.Scanner;
class InsufficientBalance extends Exception  
{
   InsufficientBalance() 
  { 
    super("InSufficientBalance in the Account");
  }
  InsufficientBalance(String message)
  {
     super(message);

 }
}

public class UserDefinedException
{  
   
 public static void main(String args[])
 {  
      long id;
     double amount;
     double bal;
     //System.out.println("enter the account id");
     //id =sc.nextLong();
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the deposit ammount");
     bal=sc.nextDouble();
     System.out.println("enter amount to withdraw");
     amount=sc.nextDouble();
     
   
    try
     {
       if (amount>bal)
        {
           throw new InsufficientBalance();  
        }
        if(amount==0)
        {
            throw new InsufficientBalance();
        }
     }
     catch(InsufficientBalance e)
     {
        e.printStackTrace();
     }
       
 }  
}  














