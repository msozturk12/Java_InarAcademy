package chapters.chapter11.CheckPoint11;

import java.util.ArrayList;

public class CheckPoint11_30 {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        list.add(2.5);
        list.add(5.7);
        list.add(1.9);
        list.add(0, 1.5);
        System.out.println(list);

        System.out.println("size is-->"+list.size());
        list.remove(1);
        list.remove(list.size() - 1);
        System.out.println(list);
        System.out.println("list.contains(1.5)-->"+list.contains(1.5));
        System.out.println("list.get(0)--->"+list.get(0));
        System.out.println(list);
    }
}
