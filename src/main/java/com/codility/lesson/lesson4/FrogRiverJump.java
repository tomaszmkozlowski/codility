package com.codility.lesson.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverJump {
    public static int calculate(int x, int[] a) {
        Set<Integer> leavePositions = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            leavePositions.add(a[i]);
            if (leavePositions.size() == x) {
                return i;
            }
        }

        return -1;
    }
}
