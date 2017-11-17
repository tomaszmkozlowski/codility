package com.codility.lesson.lesson2;

import org.junit.Assert;
import org.junit.Test;

public class OddOccurrencesInArrayTest {
    @Test
    public void testOneElementArray() {
        int result = OddOccurrencesInArray.calculate(new int[] {4});
        Assert.assertEquals(4, result);
    }

    @Test
    public void testThreeElementArray() {
        int result = OddOccurrencesInArray.calculate(new int[] {9, 3, 9});
        Assert.assertEquals(3, result);
    }

    @Test
    public void testFiveElementArray() {
        int result = OddOccurrencesInArray.calculate(new int[] {9, 3, 9, 3, 9});
        Assert.assertEquals(9, result);
    }

    @Test
    public void testSevenElementArray() {
        int result = OddOccurrencesInArray.calculate(new int[] {9, 3, 9, 3, 9, 7, 9});
        Assert.assertEquals(7, result);
    }
}
