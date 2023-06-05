package com.litongjava.algorithm.beginner;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Ping E Lee
 * 局部最小问题
 */
@Slf4j
public class Code0133 {

  /**
   * 返回相邻不相等的数组元素
   * @param maxLength
   * @param maxValue
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
   * 
   * @param arr 假设数组长度是n,无序,但是任意两个相邻位不相等置,
   * @return 返回局部最小值
   */
  public static int oneMinIndex(int[] arr) {

    if (arr == null || arr.length == 0) {
      return -1;
    }
    int n = arr.length;
    if (n == 1) {
      return 0;
    }

    // if (n == 2) {
    // return arr[0] < arr[1] ? 0 : 1;
    // }
    if (arr[0] < arr[1]) {
      return 0;
    }

    if (arr[n - 1] < arr[n - 2]) {
      return n - 1;
    }

    int l = 0;
    int r = n - 1;
    //必须保证 还剩下3个元素 L M R
    while (l < r - 1) {
      int mid = (l + r) / 2;
      if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
        return mid;
      } else {
        if (arr[mid] > arr[mid - 1]) {
          r = mid - 1;
        } else {
          l = mid + 1;
        }
      }
    }
    return arr[l] < arr[r] ? l : r;
  }

  /**
   * 测试方法
   */
  public static boolean check(int[] arr, int minIndex) {
    if (arr.length == 0) {
      return minIndex == -1;
    }
    int left = minIndex - 1;
    int right = minIndex + 1;
    boolean leftBigger = left >= 0 ? arr[left] > arr[minIndex] : true;
    boolean rightBigger = right < arr.length ? arr[right] > arr[minIndex] : true;
    return leftBigger && rightBigger;
  }

  private static void test() {
    int testTimes = 100000;
    int maxLength = 10;
    int maxValue = 20;

    for (int i = 0; i < testTimes; i++) {
      int[] arrayNotEq = randomArrayNotEq(maxLength, maxValue);
      // [12, 5, 15, 14, 10]
      // log.info("{}",arrayNotEq);
      try {
        int ans = oneMinIndex(arrayNotEq);
        if (!check(arrayNotEq, ans)) {
          log.info("{},{}", arrayNotEq, ans);
        }
      } catch (Exception e) {
        e.printStackTrace();
        log.info("{}", arrayNotEq);

      }

    }
  }

  /**
   * test01
   */
  public static void test01() {
    int[] array = { 19, 18, 10, 1, 9, 0, 17, 8, 15 };
    int ans = oneMinIndex(array);
    log.info("{},{}", array, ans);
  }

  public static void test02() {
    int[] array = { 10, 1, 3, 9, 15 };
    int ans = oneMinIndex(array);
    log.info("{},{}", array, ans);

  }

  public static void main(String[] args) {
//     test01();
     test();
//    test02();
  }

}
