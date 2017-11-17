package com.codility.lesson.lesson4;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public static int calculate(int[] a) {
        Set<Integer> numbers = new HashSet<>();
        for (int val : a) {
            numbers.add(val);
        }

        for (int i = 1; i < 1_000_002; i++) {
            if (!numbers.contains(i)) {
                return i;
            }
        }

        return 1_000_001;
    }
}
