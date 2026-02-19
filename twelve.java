import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class twelve {
    public static void main(String args[]){
        // ArrayList<String> List = new ArrayList<>();

        // List.add("Apple");
        // List.add("Banana");
        // List.add("Strawberry");
        // List.add("Grapes");

        // System.out.println(List);

        // for(String i : List){
        //     System.out.println(i);

        // }

        // System.out.println(List);
        // System.out.println(List.get(1));


        // HashSet <Integer> set = new HashSet<>();
        // set.add(100);
        // set.add(150);
        // set.add(100);
        // System.out.println(set);
        // for(int i : set){
        //     System.out.println(i);

        // }

        // LinkedHashSet<String> set = new LinkedHashSet<>();
        // set.add("C");
        // set.add("A");
        // set.add("B");
        // System.out.println(set);

        // TreeSet <Integer> set = new TreeSet<>();
        // set.add(150);   
        // set.add(100);
        // set.add(500);
        // set.add(500);
        // set.add(300);
 
        // System.out.println(set);
        // for(int i : set){
        //     System.out.println(i);
        // }

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Apple", 100);
        map.put("Banana", 200);
        map.put("Potato", 400);
        map.put("Mango", 300);

        System.out.println(map);

    }    
}
