package chapters.chapter11.CheckPoint11;

import java.util.ArrayList;

public class CheckPoint11_32 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Dallas");
        list.add("Dallas");
        list.add("Houston");
        list.add("Dallas");

        while (list.contains("Dallas")) {
            list.remove("Dallas");
        }
        System.out.println(list);
    }

/*
        for (int i = 0; i < list.size(); i++) {
            list.remove("Dallas");
        }
        System.out.println(list);  output is-->Houston,Dallas because when length become 2 it ends

    }
*/

}


