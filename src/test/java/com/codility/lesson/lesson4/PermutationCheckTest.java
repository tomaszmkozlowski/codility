package com.codility.lesson.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class PermutationCheckTest {
    @Test
    public void testOneElementArray() {
        boolean result = PermutationCheck.isPermutation(new int[] {1});
        Assert.assertEquals(true, result);

        result = PermutationCheck.isPermutation(new int[] {2});
        Assert.assertEquals(false, result);
    }

    @Test
    public void testThreeElementArray() {
        boolean result = PermutationCheck.isPermutation(new int[] {4, 1, 3});
        Assert.assertEquals(false, result);

        result = PermutationCheck.isPermutation(new int[] {3, 1, 2});
        Assert.assertEquals(true, result);
    }

    @Test
    public void testFourElementArray() {
        boolean result = PermutationCheck.isPermutation(new int[] {4, 1, 3, 2});
        Assert.assertEquals(true, result);

        result = PermutationCheck.isPermutation(new int[] {2, 3, 1, 5});
        Assert.assertEquals(false, result);
    }
}
