package DAY_20_HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class Itinerary {
    public static void ToNFor(HashMap<String ,String > n){
        HashSet<String> set = new HashSet<>(n.values());
        String start ="";
        for(String key : n.keySet()){
            if(!set.contains(key)){
                start = key;
            }
        }
        System.out.println(start);
        for(int i = 0 ;i<n.size();i++){
            System.out.println(n.get(start));
            start = n.get(start);
        }
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
