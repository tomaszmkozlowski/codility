package com.codility.lesson.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class FrogRiverJumpTest {
    @Test
    public void testZeroJumps() {
        int result = FrogRiverJump.calculate(1, new int[] {1});
        Assert.assertEquals(0, result);
    }

    @Test
    public void testNoJumpsPossible() {
        int result = FrogRiverJump.calculate(4, new int[] {4, 1, 3});
        Assert.assertEquals(-1, result);

        result = FrogRiverJump.calculate(5, new int[] {2, 3, 1, 5});
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testThreeJumps() {
        int result = FrogRiverJump.calculate(4, new int[] {4, 1, 3, 2});
        Assert.assertEquals(3, result);

        result = FrogRiverJump.calculate(4, new int[] {4, 1, 3, 2, 1, 2});
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSixJumps() {
        int result = FrogRiverJump.calculate(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4});
        Assert.assertEquals(6, result);
    }
}
