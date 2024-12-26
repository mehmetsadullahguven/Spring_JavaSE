package com.generics;

public class GenericsMain {
    public static void main(String[] args) {

        GenericsData genericsData=new GenericsData();
        genericsData.setName("ALI");
        genericsData.setSurname("VELI");
        System.out.println(genericsData.toString());

        genericsData.fullData(5);
    }
}
