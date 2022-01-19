package com.codegym;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        //HashMap
        Map<String, Integer> students = new HashMap<>();
        students.put("Bach", 25);
        students.put("Tinh", 25);
        students.put("Cuong", 20);
        students.put("Thuy", 28);
        students.put("Minh", 30);

        System.out.println("Display entire map:");
        System.out.println(students);

        String name = "Bach";
        System.out.println(name + " is " + students.get(name) + " years old.");

        //TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(students);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        //LinkedHashMap
        Map<String, Integer> teacher = new LinkedHashMap<>(16, 0.75f, true);
        teacher.put("Smith", 30);
        teacher.put("Anderson", 31);
        teacher.put("Lewis", 29);
        teacher.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + teacher.get("Lewis"));
    }
}
