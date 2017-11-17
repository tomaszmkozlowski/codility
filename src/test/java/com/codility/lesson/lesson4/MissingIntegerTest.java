package com.codility.lesson.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTest {
    @Test
    public void testNegativeNumbers() {
        int result = MissingInteger.calculate(new int[] {-1, -3});
        Assert.assertEquals(1, result);
    }

    @Test
    public void testConsecutivePositiveNumbers() {
        int result = MissingInteger.calculate(new int[] {1, 2, 3});
        Assert.assertEquals(4, result);

        result = MissingInteger.calculate(new int[] {3, 2, 4});
        Assert.assertEquals(1, result);
    }

    @Test
    public void testNumberMissingInTheMiddle() {
        int result = MissingInteger.calculate(new int[] {1, 3, 6, 4, 1, 2});
        Assert.assertEquals(5, result);

        result = MissingInteger.calculate(new int[] {1, 3, 6, 4, 1, 2, -5, 5, 8});
        Assert.assertEquals(7, result);
    }
}
