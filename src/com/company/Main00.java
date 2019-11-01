package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main00 {

    public static void main(String[] args) {
        Map<Integer, String> testMap = new LinkedHashMap<>(4, 1.1f);
        testMap.put(2, "_2");
        testMap.put(1, "_1");
        testMap.put(3, "_3");
        testMap.put(4, "_4");
        testMap.put(5, "_5");
        testMap.put(7, "_7");

        System.out.println(testMap);
    }
}
