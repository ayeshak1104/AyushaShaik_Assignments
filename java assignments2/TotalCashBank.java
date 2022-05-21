 class Bank
{
    String name;
    double totalcash;
    public Bank(String AccountholderName,double totalcash)
   {
   super();
   this.name =AccountholderName;
   this.totalcash= totalcash;
   }
   public String getAccountholderName(){
   return name;
   }
   public void setAccountholderName(String AccountholderName){
   this.name=AccountholderName;
   }
   public double gettotalcash(){
   return totalcash;
   }
   public void settotalcash(double totalcash){
   this.totalcash=totalcash;
   }
}

 class Savingsaccount extends Bank{
    long fixeddeposit=800000;
    double rateofinterest =0.9;
    public Savingsaccount(String AccountholderName,double totalcash)
    {
    super(AccountholderName,totalcash);
    }
    public double gettotalcash(){
    return totalcash+(fixeddeposit*rateofinterest);
    }
}

 class Currentaccount extends Bank{
    long cashcredit=500000;
    public Currentaccount(String AccountholderName,double totalcash)
    {
      super (AccountholderName,totalcash);
    }
    public double gettotalcash(){
    return totalcash+cashcredit;
    }
    }

public class BankCash 
{
    public static void main(String[] args)
     { double Tcash;
       Savingsaccount sa=new Savingsaccount("abbas",500000);
       sa.gettotalcash();
       Currentaccount ca=new Currentaccount("khasim",600000);
        ca.gettotalcash();
       Tcash=sa.gettotalcash()+ca.gettotalcash();
       System.out.println("name of accountholder:"+sa.getAccountholderName()+" and totalcash:"+sa.gettotalcash());
       System.out.println("name of accountholder:"+ca.getAccountholderName()+" and totalcash:"+ca.gettotalcash());
       System.out.println("total cash in bank:"+Tcash);
    }
 }
    

