package com.litongjava.algorithm.base;

public class InsertionSort {
  public void insertionSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
        int temp = arr[j];
        arr[j] = arr[j];
        arr[j + 1] = temp;
      }
    }
  }
}
