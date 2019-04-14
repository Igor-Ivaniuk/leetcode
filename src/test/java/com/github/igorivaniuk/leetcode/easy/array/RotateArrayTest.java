package com.github.igorivaniuk.leetcode.easy.array;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RotateArrayTest {

    final int[] example1 = new int[]{1, 2, 3, 4, 5, 6, 7};
    final int[] example2 = new int[]{-1, -100, 3, 99};
    RotateArray.Solution solutionUnderTest;

    @Before
    public void setUp() {
        solutionUnderTest = new RotateArray().new Solution();
    }

    @Test
    public void testExample0() {
        int[] expectedResult = new int[]{4, 1, 2, 3};
        int[] actualResult = new int[]{1, 2, 3, 4};
        solutionUnderTest.rotate(actualResult, 1);
        System.out.println(Arrays.toString(actualResult));
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testExample1() {
        int[] expectedResult = new int[]{5, 6, 7, 1, 2, 3, 4};
        int[] actualResult = Arrays.copyOf(example1, example1.length);
        solutionUnderTest.rotate(actualResult, 3);
        System.out.println(Arrays.toString(example1));
        System.out.println(Arrays.toString(actualResult));
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testExample2() {
        int[] expectedResult = new int[]{3, 99, -1, -100};
        int[] actualResult = example2;
        solutionUnderTest.rotate(actualResult, 2);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}