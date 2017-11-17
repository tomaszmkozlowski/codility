package com.codility.lesson.lesson1;

public class BinaryGap {
    private final String nInBinary;

    public BinaryGap(int n) {
        nInBinary = Integer.toBinaryString(n);
    }

    public int calculate() {
        int maxLen = 0;
        int i = findNextOne(0);
        while (i < nInBinary.length()) {
            int leftIndex = i;
            int len = calculateNumberOfZerosAt(leftIndex + 1);
            int rightIndex = leftIndex + len + 1;
            if (isOne(rightIndex)) {
                // Found next gap, update the maximum gap length
                if (len > maxLen) {
                    maxLen = len;
                }
            } else  {
                // We must have reached end of the number
                return maxLen;
            }

            i = rightIndex;
        }

        return maxLen;
    }

    private int findNextOne(int i) {
        int j = i;
        while (j < nInBinary.length() && nInBinary.charAt(j) != '1') {
            j++;
        }
        return j;
    }

    private int calculateNumberOfZerosAt(int i) {
        int len = 0;
        int j = i;
        while (j < nInBinary.length() && nInBinary.charAt(j) == '0') {
            j++;
            len++;
        }
        return len;
    }

    private boolean isOne(int i) {
        return i < nInBinary.length() && nInBinary.charAt(i) == '1';
    }
}
