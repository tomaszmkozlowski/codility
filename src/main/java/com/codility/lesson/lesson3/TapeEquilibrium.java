package com.codility.lesson.lesson3;

public class TapeEquilibrium {
    public static int calculate(int[] a) {
        int leftSum = a[0];
        int rightSum = 0;
        for (int i = 1; i < a.length; i++) {
            rightSum += a[i];
        }
        int minDifference = Math.abs(leftSum - rightSum);

        for (int i = 2; i < a.length; i++) {
            leftSum += a[i - 1];
            rightSum -= a[i - 1];
            int difference = Math.abs(leftSum - rightSum);
            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        return minDifference;
    }
}
