package top.ppnt.algorithm;

import java.util.Arrays;

/**
 * @author Ping E Lee
 *
 */
public class CodeDichotomySearch {
  public static void main(String[] args) {
    int maxValue = 10;
    int maxLength = 10;
    int totalCount = 10000;
    for (int i = 0; i < totalCount; i++) {
      // 生成数组
      int[] arr = AlgorithmUtils.randomArray(maxValue, maxLength);
      // 选择排序
      // AlgorithmUtils.selectSort(arr);
      int num = (int) (Math.random() * maxValue);
      // boolean find = find(arr, num);
      // int result = findLeftEqOrGt(arr, num);
      int result = onMainIndex(arr);
      System.out.println(Arrays.toString(arr));
      // System.out.println(num);
      System.out.println(result);
    }
  }

  /**
   * 使用二分法查找
   * @param arr
   * @param num
   * @return
   */
  public static boolean find(int[] arr, int num) {
    if (arr == null || arr.length < 1) {
      return false;
    }

    int l = 0;
    int r = arr.length - 1;
    while (l <= r) {
      int middle = (l + r) / 2;
      if (arr[middle] == num) {
        return true;
      } else if (arr[middle] < num) {
        l = middle + 1;
      } else {
        r = middle - 1;
      }
    }
    return false;
  }

  /**
   * 有序数组中找到>=num最左的位置 
   * 返回index
   */
  public static int findLeftEqOrGt(int[] arr, int num) {
    int length = arr.length;
    if (arr == null || length == 0) {
      return -1;
    }

    int l = 0;
    int r = length - 1;

    int result = -1;
    while (l <= r) {
      int middle = (l + r) / 2;
      if (arr[middle] >= 2) {
        result = middle;
        r = middle - 1;
      } else {
        l = middle + 1;
      }
    }
    return result;
  }

  /**
   * 
   * @return
   */
  public static int onMainIndex(int[] arr) {
    if (arr == null || arr.length == 0) {
      return -1;
    }
    int n = arr.length;
    if (n == 1) {
      return 0;
    }
    // if (length == 2) {
    // return arr[0] < arr[1] ? 0 : 1;
    // }
    if (arr[0] <= arr[1]) {
      return 0;
    }
    if (arr[n - 1] <= arr[n - 2]) {
      return arr[n - 1];
    }
    int result = -1;

    int l = 0;
    int r = n - 1;
    while (l > r) {
      int middle = (l + r) / 2;
      if (arr[middle] <= arr[middle - 1] && arr[middle] <= arr[middle + 1]) {
        result = middle;
        break;
      } else {
        if (arr[middle] >= arr[middle - 1]) {
          l = middle + 1;
        } else {
          r = middle - 1;
        }
      }
    }
    return result;
  }

  /**
   * 验证局部最小值是否正确
   * @param arr
   * @param num
   * @return
   */
  public static boolean check(int[] arr, int minValueIndex) {
    if (arr == null || arr.length == 0) {
      return -1 == minValueIndex;
    }
    // 判断左边的数和右边的数是否大于最小值
    int left = minValueIndex - 1;
    int right = minValueIndex + 1;

    boolean isLeftBigger = left > -1 ? arr[left] > arr[minValueIndex] : true;
    boolean isRightBigger = right > arr.length - 1 ? arr[right] > arr[minValueIndex] : true;
    return isLeftBigger && isRightBigger;
  }
}
