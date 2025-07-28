package com.leetcode.task6;

import java.util.Arrays;
import java.util.Random;

public class SpinArea {
    private final String[] values;
    private final int[] areaWeights;
    private int sum;
    private final Random random;

    public SpinArea(String[] values, int[] weights) {
        if (values.length != weights.length) {
            throw new IllegalArgumentException("values.length != weights.length");
        } else {
            this.areaWeights = new int[weights.length];

            for(int i = 0; i < weights.length; ++i) {
                if (weights[i] < 0) {
                    throw new IllegalArgumentException("Weights cannot be negative.");
                }

                this.sum += weights[i];
                this.areaWeights[i] = this.sum;
            }

            this.values = values;
            this.sum = Arrays.stream(weights).sum();
            this.random = new Random();
        }
    }

    public String getRandomValue() {
        int index = this.random.nextInt(this.sum);

        for(int i = 0; i < this.areaWeights.length; ++i) {
            if (index < this.areaWeights[i]) {
                return this.values[i];
            }
        }

        throw new IllegalStateException("Random value out of bounds");
    }
}
