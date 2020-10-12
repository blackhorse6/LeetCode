package basicJava;

import java.util.*;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-17
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class MapDemo {
    public static void main(String[] args) {
//        hashMap();
//        hashTable();
//        treeMap();
        linkedHashMap();
    }

    static void hashMap() {
        forEach(new HashMap<String, String>());
    }

    static void hashTable() {
        forEach(new Hashtable<String, String>());

    }

    static void treeMap() {
        forEach(new TreeMap<String, String>());

    }

    static void linkedHashMap() {
        forEach(new LinkedHashMap<String, String>());
    }

    static void forEach(Map<String, String> map) {
        map.put("fff", "fff");
        map.put("mmm", "mmm");
        map.put("ggg", "ggg");
        map.put("sss", "sss");
        map.put("aaa", "aaa");
        map.put("bbb", "bbb");


        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("");
    }
}
