public class AllOP {
    
 public static void main(String args[])
 { 
    String str = "Java String pool refers to collection of Strings which are stored in heap memory";
    String str2 = "Java String pool refers to collection of Strings which are stored in heap memory";  
    System.out.println(str.toLowerCase());
      System.out.println(str.toUpperCase());
      String s1 =str.replace('a','$');
      System.out.println(s1);
      System.out.println(str.contains("collection"));
      System.out.println(str.matches("java string pool refers to collection of strings which are stored in heap memory"));
      System.out.println(str.equals(str2));
}



}
    
        
