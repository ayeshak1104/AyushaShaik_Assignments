import java.util.Scanner;
interface Persistence
{
   public void persist ();

}
class FilePersistence implements Persistence
{
     public void persist()
    {
        System.out.println("persistance sub class 1 ");
    }
}
class  DatabasePersistence implements Persistence 
{
    public void persist()
    {
        
        System.out.println("persistenace sub class 2");
    }
}
public class Persis
 {
    public static void main(String args[])
    {
        String data;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the data ");
        data =sc.next();
        if(data=="FilePersistance")
        {
            FilePersistence obj=new FilePersistence();
         obj.persist();
        }
        else{
            DatabasePersistence obj1=new DatabasePersistence();
            obj1.persist();
        }
    }
}

