package tree_maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>((o1, o2) -> o2 - o1);

        tree.put(1, "Hello");
        tree.put(5, "Bollo");
        tree.put(9, "Gelo");
        tree.put(5, "demo");

        System.out.println("TreeMap: " + tree);

        System.out.println("First Key: " + tree.firstKey());
        System.out.println("Last Key: " + tree.lastKey());

        System.out.println("Value for key 5: " + tree.get(5));

        tree.remove(9);
        System.out.println("After removing key 9: " + tree);

        System.out.println("Contains key 1? " + tree.containsKey(1));
        System.out.println("Contains value 'demo'? " + tree.containsValue("demo"));

        System.out.println("HeadMap (keys > 5): " + tree.headMap(5));
        System.out.println("TailMap (keys <= 5): " + tree.tailMap(5));

        System.out.println("KeySet: " + tree.keySet());
        System.out.println("Values: " + tree.values());
        System.out.println("EntrySet: " + tree.entrySet());
        
        
        TreeMap<String,List<String>> map=new TreeMap();
        
        List<String> l1=Arrays.asList("Kolkata","Hyderabad");
        List<String> l2=Arrays.asList("Kolkata","Hyderabad","Pune");
        map.put("SBI", l1);
        map.put("HDFC", l2);
        System.out.println(map);
        
        
        Set<Integer> set=tree.keySet();
        Iterator<Integer> itr1=set.iterator();
        while(itr1.hasNext()) {
        	System.out.println(itr1.next());
        }
        System.out.println("---------------------------");
        Collection<String> c=tree.values();
        Iterator<String> itr2=c.iterator();
        while(itr2.hasNext()) {
        	System.out.println(itr2.next());
        }
        System.out.println("---------------------------");
    }
}
