package com.codility.lesson.lesson3;

import org.junit.Assert;
import org.junit.Test;

public class PermutationMissingElementTest {
    @Test
    public void testPermutationsOfOneNumber() {
        int result = PermutationMissingElement.calculate(new int[] {});
        Assert.assertEquals(1, result);
    }

    @Test
    public void testPermutationsOfTwoNumbers() {
        int result = PermutationMissingElement.calculate(new int[] {2});
        Assert.assertEquals(1, result);
    }

    @Test
    public void testPermutationOfFiveNumbers() {
        int result = PermutationMissingElement.calculate(new int[] {1, 2, 3, 5});
        Assert.assertEquals(4, result);

        result = PermutationMissingElement.calculate(new int[] {2, 3, 1, 5});
        Assert.assertEquals(4, result);
    }
}
