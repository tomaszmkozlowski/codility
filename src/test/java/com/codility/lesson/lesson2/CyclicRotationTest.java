package com.codility.lesson.lesson2;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTest {
    @Test
    public void testRotationOfEmptyArray() {
        int[] emptyArray = new int[] {};

        Assert.assertArrayEquals(emptyArray, CyclicRotation.calculate(emptyArray, 0));
        Assert.assertArrayEquals(emptyArray, CyclicRotation.calculate(emptyArray, 2));
    }

    @Test
    public void testRotationByZero() {
        int[] numbers = new int[] {3, 8, 9, 7, 6};
        Assert.assertArrayEquals(numbers, CyclicRotation.calculate(numbers, 0));
    }

    @Test
    public void testRotationByOne() {
        int[] numbers = new int[] {3, 8, 9, 7, 6};
        Assert.assertArrayEquals(new int[] {6, 3, 8, 9, 7},
                CyclicRotation.calculate(numbers, 1));

        numbers = new int[] {0, 0, 0};
        Assert.assertArrayEquals(numbers, CyclicRotation.calculate(numbers, 1));
    }

    @Test
    public void testRotationByFour() {
        int[] numbers = new int[] {3, 8, 9, 7, 6};
        Assert.assertArrayEquals(new int[] {8, 9, 7, 6, 3},
                CyclicRotation.calculate(numbers, 4));

        numbers = new int[] {1, 2, 3, 4};
        Assert.assertArrayEquals(numbers, CyclicRotation.calculate(numbers, 4));
    }

    @Test
    public void testRotationByArrayLength() {
        int[] numbers = new int[] {3, 8, 9, 7, 6};
        Assert.assertArrayEquals(numbers, CyclicRotation.calculate(numbers, numbers.length));
    }

    @Test
    public void testRotationByLargeNumber() {
        int[] numbers = new int[] {3, 8, 9, 7, 6};
        Assert.assertArrayEquals(new int[] {6, 3, 8, 9, 7},
                CyclicRotation.calculate(numbers, 11));
    }
}
