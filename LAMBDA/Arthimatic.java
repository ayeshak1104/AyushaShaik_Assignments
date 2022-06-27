import java.util.function.*;
public class Arthimatic 
{
    public static void main(String args[])
    {
         
        BiFunction
            <Integer, Integer, Integer> Add = (i1, i2) -> i1 + i2;
     
            
            BiFunction <Integer, Integer, Integer> Sub = (i1, i2) -> i1 - i2;
     
            
            BiFunction <Integer, Integer, Integer> Multi = (i1, i2) -> i1 * i2;
     
            
            BiFunction <Integer, Integer, Integer> Divide = (i1, i2) -> i1 / i2;
     
            
            BiFunction <Integer, Integer, Integer> Modul = (i1, i2) -> i1 % i2;
     
            System.out.println("Addition of 10 and 5: " + Add.apply(10, 5));
     
            System.out.println("Subtract of 10 and 5: " + Sub.apply(10, 5));
     
            System.out.println("Multiply of 10 and 5: " + Multi.apply(10, 5));
     
            System.out.println("Division of 10 and 5: " + Divide.apply(10, 5));
     
            System.out.println("Modulo of 10 and 5: " + Modul.apply(10, 5));
     
    }
}
    
