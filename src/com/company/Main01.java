package com.company;

import java.util.Map;
import java.util.WeakHashMap;

public class Main01 {

    public static void main(String[] args) {
        Map<Object,String> testMap = new WeakHashMap<>();
        Object data = new Object();
        testMap.put(data,"Test");
        data = null;
        System.gc();
        for (int i=0; i< 100000; i++) {
            if (testMap.isEmpty()) {
                System.out.println("Empty!" + i);
                break;
            }
        }
    }
}
