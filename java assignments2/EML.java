class EMP //creatin base class
{
   void total_sal(int man, int lab) //creating a method
    {
        int t= man+ lab;
        System.out.println("this is emp total salary="+t);
        
    }

    
}
class Man extends EMP //inherting the base classe(overriding )
{
   void total_sal()
   {
       
       System.out.println("this manager salary");
   }
}
class Labo extends EMP
{
    void total_sal()
    {
        System.out.println("this labour salary");
    }

}
public class EML
{
    public static void main(String args[])
    {
        Man ts= new Man ();//creating a object for child class
        ts.total_sal(200084,23764);//calling a method
        

    }
}
