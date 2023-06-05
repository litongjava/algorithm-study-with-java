package com.litongjava.algorithm.beginner;

import java.util.Arrays;

public class Code_PrefixArray {
  public static void main(String[] args) {
    int[] src = { 3, 4, 1, 2, 6, 7, 8 };
    System.out.println(Arrays.toString(src));
    System.out.println(sum(src,3,5));
  }

  private static int sum(int[] src, int i, int j) {
    PrefixSum prefixSum = new PrefixSum(src);
    int sum=prefixSum.sum(i,j);
    return sum;
  }
}
