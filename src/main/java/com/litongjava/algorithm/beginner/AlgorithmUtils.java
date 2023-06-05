package com.litongjava.algorithm.beginner;

/**
 * @author Ping E Lee
 *
 */
public class AlgorithmUtils {

  /**
   * 返回一个长度和值都是随机的数组,
   * 长度是[0,maxLength-),arr中的每个值[0,maxValue-1]
   * @param maxValue
   * @param maxLength
   * @return
   */
  public static int[] randomArray(int maxValue, int maxLength) {
    int len = (int) (Math.random() * maxLength);
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = (int) (Math.random() * maxValue);
    }
    return arr;
  }

  /**
   * 返回相邻不相等的数组元素
   * @param maxValue
   * @param maxLength
   * @return
   */
  public static int[] randomArrayNotEq(int maxLength, int maxValue) {
    int len = (int) (Math.random() * maxLength);
    int[] arr = new int[len];
    if (len > 1) {
      arr[0] = (int) (Math.random() * maxValue);
    } else {
      return arr;
    }

    int i = 1;
    while (i < len) {
      arr[i] = (int) (Math.random() * maxValue);
      if (arr[i] != arr[i - 1]) {
        i++;
      }
    }

    return arr;
  }

  /**
   * 判断数组中是否有相同值的元素
   * @param arr
   * @return
   */
  public static boolean isEq(int[] arr) {
    // 如果只有一个元素也可不能重复
    if (arr == null || arr.length < 2) {
      return false;
    }
    int first = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (first == arr[i]) {
        return true;
      }
    }
    return false;
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

  /**
   * 判断两个相邻元素是否相等,如果相等,返回true
   * @param randomArrayNotEq
   * @return
   */
  public static boolean isNerghborEq(int[] arr) {
    if (arr == null || arr.length < 2) {
      return false;
    }
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] == arr[i + 1]) {
        return true;
      }
    }
    return false;
  }

 
}
