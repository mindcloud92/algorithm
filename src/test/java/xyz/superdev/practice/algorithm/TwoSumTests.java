package xyz.superdev.practice.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TwoSumTests {

    private static TwoSum twoSum;

    @BeforeAll
    public static void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void given_NumberArrayAndGoal_when_FindPair_then_PairArray() {
        int[] arr = {-3, 4, 3, 90};
        int goal = 0;

        int[] actual = twoSum.solve(arr, goal);

        int[] expected = {0, 2};
        assertArrayEquals(expected, actual);
    }

}
