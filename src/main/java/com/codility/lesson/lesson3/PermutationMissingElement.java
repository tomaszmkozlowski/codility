package com.codility.lesson.lesson3;

public class PermutationMissingElement {
    public static int calculate(int[] a) {
        int result = 0;
        for (int i = 1; i <= a.length + 1; i++) {
            result ^= i;
        }
        for (int val : a) {
            result ^= val;
        }

        return result;
    }
}
