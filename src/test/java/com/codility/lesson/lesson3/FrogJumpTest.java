package com.codility.lesson.lesson3;

import org.junit.Assert;
import org.junit.Test;

public class FrogJumpTest {
    @Test
    public void testZeroJumps() {
        int result = FrogJump.calculate(20, 20, 30);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testOneJump() {
        int result = FrogJump.calculate(10, 12, 25);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testThreeJumps() {
        int result = FrogJump.calculate(10, 85, 30);
        Assert.assertEquals(3, result);
    }
}
