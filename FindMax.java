package com.day4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList();
        intList.add(52);
        intList.add(10);
        intList.add(2);
        intList.add(1000);
        findMaximum(intList);
        findMax(intList);
        maxinDiffWay(intList);
        System.out.println("Integer MaxValue: "+max(intList));

        List<String> strList = new ArrayList();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Pineapple");
        findMaximumStr(strList);
        findMax(strList);
        maxinDiffWay(strList);
        System.out.println("String MaxValue: "+max(strList));

        List<Float> floatList = new ArrayList();
        floatList.add((float) 1.00009);
        floatList.add((float) 200.0909);
        floatList.add((float) 0.1111111);
        findMaximumFloat(floatList);
        findMax(floatList);
        maxinDiffWay(floatList);
        System.out.println("String MaxValue: "+max(floatList));
    }

    private static void findMaximumStr(List strList) {
        String max = (String) Collections.max(strList);
        System.out.println("Maximum value: "+max);
    }

    private static void findMaximumFloat(List strList) {
        Float max = (Float) Collections.max(strList);
        System.out.println("Maximum value: "+max);
    }

    private static void findMaximum(List integerList) {
        //Integer max = integerList.stream().max(Integer::compare).get();
        Integer max = (Integer) Collections.max(integerList);
        System.out.println("Maximum value: "+max);
    }

    private static  <T> void findMax(List list) {
        T max = (T) Collections.max(list);
        System.out.println("FindMax value: "+max);
    }

    public static <T extends Comparable<T>> T max(List<T> list) {
        T max = list.get(0);
        for (T element : list)
            if (element.compareTo(max) > 0) {
                max = element;
            }
        return max;
    }

    public static <T extends Comparable<T>> void maxinDiffWay(List<T> list) {
        T max = list.stream().max(T::compareTo).get();
        System.out.println("maxinDiffWay: "+max);
    }
}
