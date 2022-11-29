package chapters.chapter13.Listing13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class L13_05LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(17);
        list.add(4214.12);
        list.add(new BigInteger("987654321654987"));
        list.add(new BigDecimal("2.01234567896545552132132154"));

        System.out.println("The largest number is " + getLargestNumber(list));
    }

    private static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Number number = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);

            }

        }
        return number;
    }


}
