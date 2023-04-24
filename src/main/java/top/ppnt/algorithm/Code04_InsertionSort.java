package top.ppnt.algorithm;

import java.util.Arrays;

/**
 * @author Ping E Lee
 *
 */
public class Code04_InsertionSort {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
    System.out.println(Arrays.toString(arr));
    // selectSort(arr);
    insertionSort2(arr);
    System.out.println(Arrays.toString(arr));

  }

  public static void insertionSort2(int[] arr) {
    int n = arr.length;
    if (arr == null || n < 2) {
      return;
    }
    for (int end = 1; end < n; end++) {
      for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
        swap(arr, pre, pre + 1);
      }
    }
  }

  /**
   * 插入排序
   * @param arr
   */
  private static void insertionSort(int[] arr) {
    int n = arr.length;
    if (arr == null || n < 2) {
      return;
    }
    for (int i = 1; i < n; i++) {
      int newIndex = i;
      while (newIndex - 1 > -1 && arr[newIndex - 1] > arr[newIndex]) {
        swap(arr, newIndex - 1, newIndex);
        newIndex--;
      }
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
