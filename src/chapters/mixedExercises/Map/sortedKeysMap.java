package chapters.mixedExercises.Map;

import java.util.*;

public class sortedKeysMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(5,5);
        map.put(6,78);
        map.put(15,7);
        map.put(78,9);
        map.put(1,10);

        List<Integer>sortedKeys=new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);

        for (int i = 0; i < sortedKeys.size(); i++) {
            System.out.println(sortedKeys.get(i) + " " + map.get(sortedKeys.get(i)));

        }

    }
}
