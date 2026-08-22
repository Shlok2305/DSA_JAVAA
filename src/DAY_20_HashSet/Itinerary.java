package DAY_20_HashSet;

import java.util.*;

public class Itinerary {
    public static void ToNFor(HashMap<String ,String > n){
        HashSet<String> set = new HashSet<>(n.values());
        String start ="";
        for(String key : n.keySet()){
            if(!set.contains(key)){
                start = key;
            }
        }
        for(int i = 0 ;i<n.size();i++){
            System.out.println(start);
            start = n.get(start);
        }
        System.out.println(start);
    }

    public static void main(String[] args) {
        HashMap<String,String> n = new HashMap<>();
        n.put("chennai","bang");
        n.put("mum","del");
        n.put("goa","chennai");
        n.put("del","goa");

        ToNFor(n);
    }
}
