import java.util.Scanner;
public class Armrange 
{
    public static void main(String[] args) 
  {
       Scanner sc= new Scanner(System.in); 
       System.out.print("enter first number"); 
       int a= sc.nextInt();
       System.out.print("enter second  number"); 
       int b= sc.nextInt();
        for(int i=a; i<=b; i++)
        {
            int num=i;
            int sum=0;
            while(num>0)
            {
                 int rem=num%10;
                 sum=sum+(rem*rem*rem);
                 num=num/10;
            }
            if(sum==i)
            {
                System.out.println(sum);

            }
        }
    }
}