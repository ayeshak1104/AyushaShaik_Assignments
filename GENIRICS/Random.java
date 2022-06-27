

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Random 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,Double> map = new HashMap<>();
		map.put(1,0.1);
		map.put(2,0.2);
		map.put(3,0.5);
		map.put(4,0.8);
		map.put(5,0.7);
		map.put(6,0.3);
		map.put(9,0.9);
		map.put(10,2.4);
		map.put(21,1.6);
		map.put(8,6.2);
		
        System.out.println("Mapping of HAshMap are: "+map);
    }
}