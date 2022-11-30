package chapters.chapter13.Listing13;

import java.math.BigInteger;

public class L13_08SortComparableObjects {
    public static void main(String[] args) {
        String [] cities = {"Savannah", "Bursa", "Atlanta", "Trabzon"};
   java.util.Arrays.sort(cities);
        for (String city:cities) {
            System.out.print(city + " ");
        }
        System.out.println();
        BigInteger[] hugeNumber = {new BigInteger("2315321315"),new BigInteger("43254654632154"),new BigInteger("5646854654654654645654")};
        java.util.Arrays.sort(hugeNumber);
        for (BigInteger num:hugeNumber ) {
            System.out.print(num + " ");

        }
    }

}
