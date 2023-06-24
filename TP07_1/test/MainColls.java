package TP07_1.test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class MainColls {
    public static void main(String[] args) {
        var ar = new ArrayList<String>(List.of("Bopha", "Sokha"));
        System.out.println(ar.toString());

        var di = new Hashtable<String, String>();
        di.put("Un", "One");
        di.put("Deux", "Two");
        di.put("Trois", "Three");

        System.out.println(di.get("Deux"));
        
        var enFr = new Hashtable<String, String>(){{
            put("Four", "Quatre");
            put("Five", "Cinq");
            put("Six", "Six");
        }};
        System.out.println(enFr.get("Five"));
    }
}
