package com.codility.lesson.lesson1;

import org.junit.Assert;
import org.junit.Test;

public class BinaryGapTest {
    @Test
    public void testNumbersWithZeroBitGap() {
        BinaryGap binaryGap = new BinaryGap(1);
        Assert.assertEquals(0, binaryGap.calculate());

        binaryGap = new BinaryGap(2);
        Assert.assertEquals(0, binaryGap.calculate());

        binaryGap = new BinaryGap(4);
        Assert.assertEquals(0, binaryGap.calculate());

        binaryGap = new BinaryGap(14);
        Assert.assertEquals(0, binaryGap.calculate());

        binaryGap = new BinaryGap(15);
        Assert.assertEquals(0, binaryGap.calculate());
    }

    @Test
    public void testNumbersWithOneBitGap() {
        BinaryGap binaryGap = new BinaryGap(20);
        Assert.assertEquals(1, binaryGap.calculate());
    }

    @Test
    public void testNumbersWithTwoBitGap() {
        BinaryGap binaryGap = new BinaryGap(9);
        Assert.assertEquals(2, binaryGap.calculate());
    }

    @Test
    public void testNumbersWithFourBitGap() {
        BinaryGap binaryGap = new BinaryGap(529);
        Assert.assertEquals(4, binaryGap.calculate());

        binaryGap = new BinaryGap(537);
        Assert.assertEquals(4, binaryGap.calculate());
    }

    @Test
    public void testNumbersWithFiveBitGap() {
        BinaryGap binaryGap = new BinaryGap(1041);
        Assert.assertEquals(5, binaryGap.calculate());

        binaryGap = new BinaryGap(2113);
        Assert.assertEquals(5, binaryGap.calculate());
    }
}
