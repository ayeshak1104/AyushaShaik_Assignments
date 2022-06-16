import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class  Unsupported 
{
      public static void main(String args[])
      {
          List<String> nameList =new ArrayList<>();
            nameList.add("John");
            nameList.add("Ramya");
            nameList.add("Ayesha");
            nameList.add("Sree");
            nameList.add("Yamini");
            Collection<String>collection= Collections.unmodifiableCollection(nameList);
            for(String element:collection)
            {
               System.out.println(element);
               if(element.contains("Ramya"))
               {
                   collection.remove(element);

               }
            }
             System.out.println(nameList);

        }
    
}
