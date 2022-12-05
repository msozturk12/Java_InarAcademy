package weeks.week_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mymap {
    public static void main(String[] args) {
        /*
        1-Works with key-value principle
        2-All the key in a Map must be uniq
         */
        Map<String,String> inarMap = new HashMap<>();

        inarMap.put("kuruluş yılı","2020");
        inarMap.put("öğrenci sayısı","51");
        inarMap.put("Teacher","Tarıq");
        inarMap.get("1");


        printMap(inarMap);
    }

    private static void printMap(Map<String, String> inarMap) {

        Set<String> set = inarMap.keySet();
        for (String key : set) {
            System.out.println(key + " : " + inarMap.get(key));

        }
    }
}
