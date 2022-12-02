package chapters.chapter13.Exercises13.Exercises13_03;

import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = getRandomNumbers();
        System.out.println("Before sorted");
        displayArrayList(list);
        System.out.println("\nAfter sorted");
        sort(list);
        displayArrayList(list);

    }

    private static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).doubleValue() > list.get(j + 1).doubleValue()) {
                    Number temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    private static void displayArrayList(ArrayList<Number> list) {
        for (Number num : list)
            System.out.print(num + " ");
    }

    private static ArrayList<Number> getRandomNumbers() {
        ArrayList<Number> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int r = (int) (Math.random() * 100);
            list.add(r);

        }
        return list;
    }
}
