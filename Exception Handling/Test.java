import java.io.FileInputStream;
 class Test
{
    public static void main(String args[])
    {

      try
      {

      int a=100,b=0,c;
       c=a/b;
       System.out.println(c);
      }
       catch(Exception e)
       {
          System.out.println("divided by zero not possible");
        } 
       
       
    }
}
