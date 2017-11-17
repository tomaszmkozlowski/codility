package com.codility.lesson.lesson3;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibriumTest {
    @Test
    public void testOneElementArray() {
        int result = TapeEquilibrium.calculate(new int[] {-3});
        Assert.assertEquals(3, result);
    }

    @Test
    public void testOTwoElementArray() {
        int result = TapeEquilibrium.calculate(new int[] {-3, 2});
        Assert.assertEquals(5, result);
    }

    @Test
    public void testFiveElementArray() {
        int result = TapeEquilibrium.calculate(new int[] {3, 1, 2, 4, 3});
        Assert.assertEquals(1, result);

        result = TapeEquilibrium.calculate(new int[] {3, -1, 2, 4, 3});
        Assert.assertEquals(3, result);
    }
}
