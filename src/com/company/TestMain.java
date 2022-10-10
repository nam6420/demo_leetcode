package com.company;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        int[] s = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(s));
    }

    static void print(Object... obj) {
        System.out.println("Object…: " + obj[0]);
    }

    public static String createPhoneNumber(int[] numbers) {

        if (numbers.length != 0) {
            Integer[] oArray = Arrays.stream( numbers ).boxed().toArray( Integer[]::new );
            return String.format("(%d%d%d) %d%d%d-%d%d%d%d", oArray);
        }

        return null;
    }

}
