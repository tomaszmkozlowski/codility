package com.codility.lesson.lesson3;

public class FrogJump {
    public static int calculate(int x, int y, int d) {
        return (int) Math.ceil((double) (y - x) / d);
    }
}
