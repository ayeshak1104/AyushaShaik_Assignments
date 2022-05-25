   import java.util.Scanner;
   class InsufficientBalance extends Exception  
   {
      InsufficientBalance() 
     { 
       super("IllegalBankTransaction");
     }
     InsufficientBalance(String message)
     {
        super(message);

    }
}
   
public class Illegal
  {  
    public static void main(String args[])
    {
        double amount;
        System.out.println("enter the amount");
        Scanner sc = new Scanner(System.in);
        amount=sc.nextDouble();
      
       try
        {
          if (amount<0)
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














