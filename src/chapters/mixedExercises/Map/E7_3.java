package chapters.mixedExercises.Map;

import java.util.*;

public class E7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the integer between 1 and 100");
        int number;
        do {
            number = input.nextInt();
            if (number > 0) {
                if (!map.containsKey(number)) {
                    map.put(number, 1);
                } else {
                    int occurrence = map.get(number);
                    map.put(number, occurrence + 1);

                }
            }


        } while (number != 0);

   displayMap(map);
    }

    private static void displayMap(Map<Integer, Integer> map) {
        Set<Map.Entry<Integer,Integer>> result = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : result){
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + (entry.getValue() >1 ? " times" :" time " ) );
        }

    }
}