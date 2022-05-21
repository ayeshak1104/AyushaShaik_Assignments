 //1.  If any class has any of its method abstract then you must 
 //declare entire class abstract.
 
abstract class Shape   //4.Abstract class can not be private here by 
                     //default public and also can not be final
{
     abstract void draw();
    
}


abstract class Shows //You can declare a class abstract without having any abstract method
{
    void talk()
    {
        System.out.println("this is talk show");
    }

}


//*3. When we extend an abstract class, we must either override all the
//abstract methods in sub class 
//or declare subclass as abstract

 class line extends Shape
   {
       void draw()
       {
           System.out.println("Drawing a line ");
       }
   }


//

public class Abstr4 {
    public static void main(String args[])
    {
    // 2.object for the abstract class can not be created object created
    // for only sub classes
      
    line l = new line();
    l.draw();  
}
}
