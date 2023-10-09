package com.litongjava.algorithm.base;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {
  @Test
  public void test01() {
    InsertionSort insertionSort = new InsertionSort();
    int testTime = 500000;
    int maxSize = 100;
    int maxValue = 100;
    boolean succed = true;
    for (int i = 0; i < testTime; i++) {
//      int[] arr, arr1, arr2;
//      arr = arr1 = arr2 = generateRandomArray(maxSize, maxValue);
      int[] arr=generateRandomArray(maxSize,maxValue);
      int[] arr1 = Arrays.copyOf(arr, arr.length);
      int[] arr2 = Arrays.copyOf(arr, arr.length);
      insertionSort.insertionSort(arr1);
      Arrays.sort(arr2);
      if (!Arrays.equals(arr1, arr2)) {
        System.out.println(Arrays.toString(arr) + "\n" + Arrays.toString(arr1)
          + "\n" + Arrays.toString(arr2));
        succed = false;
        break;
      }
    }
    System.out.println(succed);
  }

  private int[] generateRandomArray(int maxSize, int maxValue) {
    //length random
    int n = (int) ((maxSize + 1) * Math.random());
    int[] arr = new int[n];
    //fill out value
    for (int i = 0; i < n; i++) {
      arr[i] = (int) ((maxSize + 1) * Math.random()) - (int) (maxSize * Math.random());
    }
    return arr;
  }
}