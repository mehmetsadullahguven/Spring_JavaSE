package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListData {

    public static void ArrayListValue()
    {
        ArrayList<Object> list = new ArrayList<>();
        list.add("java_se");
        list.add("java_Se_2");
        list.add("java_Se_3");
        list.add("java_Se_4");

        System.out.println(list.size());
        System.out.println(list.getLast());
        System.out.println(list.isEmpty());
    }

    public static void LinkedListValue()
    {
        LinkedList<String> list2 = new LinkedList<>();

        list2.add("a");
        list2.add("b");
        list2.add("c");

        System.out.println(list2.get(1));
        System.out.println(list2.size());
        System.out.println(list2.getLast());
        System.out.println(list2.isEmpty());
    }

    public static List<String> dataSet()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("java_se");
        list.add("java_Se_2");
        list.add("java_Se_3");
        list.add("java_Se_4");

        return list;
    }

    public static void forEachLoop()
    {
        List <String> list = dataSet();
        for (int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("xxxxxxxxxxxxxxx");

        for (String listOne : list) {
            System.out.println(listOne);
        }

        System.out.println("xxxxxxxxxxxxxxx");

        list.forEach((temp)->{
            System.out.println(temp);
        });

        System.out.println("xxxxxxxxxxxxxxx");

        list.forEach(System.out::println);

    }


    public static void main(String[] args) {
        forEachLoop();
    }
}
