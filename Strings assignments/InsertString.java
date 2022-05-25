public class InsertString{

    public static void main(String args[])
    {
        StringBuffer s = new StringBuffer("It is used to_;");
         s.insert(14,"insert text");
         System.out.println(s);
    }
}