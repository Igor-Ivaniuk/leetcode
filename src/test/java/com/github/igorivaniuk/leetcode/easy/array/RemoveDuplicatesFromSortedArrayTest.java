package com.github.igorivaniuk.leetcode.easy.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RemoveDuplicatesFromSortedArrayTest {

  RemoveDuplicatesFromSortedArray.Solution s;

  @Before
  public void setUp() {
    s = new RemoveDuplicatesFromSortedArray().new Solution();
  }

  @Test
  public void testPrint() {

    int[] intArray = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    System.out.println(s.removeDuplicates(intArray));
    System.out.println(Arrays.toString(intArray));

  }

  @Test
  public void test() {
    RemoveDuplicatesFromSortedArray.Solution s = new RemoveDuplicatesFromSortedArray().new Solution();
    int[] input = new int[]{1, 1, 2};
    int[] result = new int[]{1, 1, 2};
    int newLength = s.removeDuplicates(result);

    assertThat(newLength).isEqualTo(2);
    assertThat(Arrays.equals(input, result)).isFalse();
    assertThat(result[0]).isEqualTo(1);
    assertThat(result[1]).isEqualTo(2);
  }
}