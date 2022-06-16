public class Transaction 
{
    Trader trader;
    int year;
    int value;

Transaction(Trader trader,int year,int value)
    {
        super();
      this.trader=trader;
      this.year=year;
      this.value=value;
      


     }

     public Trader getT() {
        return trader;
    }
    public void setT(Trader t) {
        this.trader = t;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    




}