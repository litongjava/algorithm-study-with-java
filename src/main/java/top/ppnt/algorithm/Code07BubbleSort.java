package top.ppnt.algorithm;

import java.util.Arrays;

/**
 * @author Ping E Lee
 *
 */
public class Code07BubbleSort {

  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
    System.out.println(Arrays.toString(arr));
    // selectSort(arr);
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));

  }

  /**
   * 冒泡排序
   * @param arr
   */
  private static void bubbleSort(int[] arr) {
    int length=arr.length;
    if(arr==null|| length<2) {
      return;
    }
    for(int end=length-1;end>0;end--) {
      for(int second=1;second<=end;second++) {
        if(arr[second-1]>arr[second]) {
          swap(arr,second-1,second);
        }
      }
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
