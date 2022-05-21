import java.util.Scanner;

public class Amstrong {
  public static void main(String[] args) 
  {
       Scanner sc= new Scanner(System.in); 
       System.out.print("input a number"); 
       int a= sc.nextInt();
       int len=0;
       int t1=a;
       while(t1!=0)
       {
           t1=t1/10;
           len=len+1;
        }
        int t2=a;
        int arm=0;
        while(t2!=0)
        {
            int mul=1;
            int re = t2%10;
            for(int i=1;i<=len;i++)
            {
              mul=mul*re;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==a)
        {
            System.out.println(a+"numaber is amstrong");
        }
        else
        {
            System.out.println("not amstrong number");
        }
         
    }
}
