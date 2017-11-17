package com.codility.lesson.lesson2;

public class CyclicRotation {
    public static int[] calculate(int[] a, int k) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[(i + k) % a.length] = a[i];
        }

        return result;
    }
}
