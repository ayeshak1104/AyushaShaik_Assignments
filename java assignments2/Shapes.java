import javax.sound.sampled.Line;

abstract class Shape
{
   abstract void draw();

}
class line extends Shape
{
    void draw()
    {
        System.out.println("Drawing a line ");
    }
}
class Rect extends Shape  
{
    void draw()
    {
        System.out.println("Drawing a Rectangle");
    }
}
class Cube extends Shape
{
    void draw()
    {
        System.out.println("Drawing a Cube");
    }
}
class Shapes{
 public static void main(String args[])
    {
        line l =new line();
        l.draw();
        Rect r =new Rect();
        r.draw();
        Cube c=new Cube();
        c.draw();

        
    }
}
