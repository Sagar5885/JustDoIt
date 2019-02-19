package DataStructure;

import com.sun.javafx.geom.transform.Identity;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MapDebug {

    public static void main(String args[]){

        String s1 = "FB";
        String s2 = "Ea";
        //Both s1 and s2 will create same hashcode - so in hash map bellow it will hashcolison but Hashmap handles it

        System.out.println(s1.hashCode() +" "+s2.hashCode());

        Map<String, Integer> map = new HashMap<>();
//        map.put("aaa", 1);
//        map.put("bbb", 2);
//        map.put("ccc", 3);
//        map.put("ddd", 4);

        map.put(s1, 4);
        map.put(s2, 3);
        map.put(null, 4);

    }

    //Java8 - when map will have too many unequal keys which gives same hashcode(index) - when no of items in hash bucket grows beyond certian threshold
    //(TREEIFY_THRESHOLD = 8), content of the bucket switches from using a linked list of Entry Object to do Balance Tree and that helps to improve perf of
    //Hashmap from O(n) to O(log n)

    //Different Types of Maps: ConcurrentHashMap, Collections.synchronizedMap() HashMap, HashTable, IdentityHashMap, Enum, WeakHashMap, LinkedHashMap,
    //ConcurrentSkipListMap, TreeMap


}
