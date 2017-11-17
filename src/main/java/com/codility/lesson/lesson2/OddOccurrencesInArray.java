package com.codility.lesson.lesson2;

public class OddOccurrencesInArray {
    public static int calculate(int[] a) {
        int result = 0;
        for (int val : a) {
            result ^= val;
        }
        return result;
    }
}
