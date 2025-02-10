package com.example.ppt;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public List<String> getCountryList(String c1, String c2, String c3, String c4, String c5) {
        List<String> countryList = new ArrayList<String>();
        countryList.add(c1);
        countryList.add(c2);
        countryList.add(c3);
        countryList.add(c4);
        countryList.add(c5);
        return countryList;
    }

    public List<Integer> get1To10() {
        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            numList.add(i);
        }
        return numList;
    }

    public List<Integer> get1To15(List<Integer> numList) {
        List<Integer> numList2 = new ArrayList<Integer>();
        numList2.addAll(numList);
        for (int i = 11; i <= 15; i++) {
            numList2.add(i);
        }
        return numList2;
    }

    public static void main(String args[]) {
        ArrayListEx ex1 = new ArrayListEx();
        System.out.println(ex1.getCountryList("India", "Australia", "England", "South Africa", "New Zealand"));
        List<Integer> numList = ex1.get1To10();
        System.out.println(numList);
        System.out.println(ex1.get1To15(numList));
    }
}
