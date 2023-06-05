package com.litongjava.algorithm.beginner;

import java.util.Arrays;

/**
 * @author Ping E Lee
 */
public class Code07_SelectSort {

  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
    System.out.println(Arrays.toString(arr));
     selectSort(arr);
    System.out.println(Arrays.toString(arr));

  }

  /**
   * 选择排序
   * @param arr
   */
  public static void selectSort(int[] arr) {
    int length = arr.length;
    if (arr == null || length < 2) {
      return;
    }
    for (int i = 0; i < length; i++) {
      int minValueIndex = i;
      for (int j = i + 1; j < length; j++) {
        minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
      }
      swap(arr, i, minValueIndex);
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
