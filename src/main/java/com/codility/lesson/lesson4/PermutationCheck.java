package com.codility.lesson.lesson4;

public class PermutationCheck {
    public static boolean isPermutation(int[] a) {
        int result = 0;
        for (int i = 1; i <= a.length; i++) {
            result ^= i;
        }
        for (int val : a) {
            result ^= val;
        }

        return result == 0;
    }
}
