package com.litongjava.algorithm.beginner;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Ping E Lee
 *
 */
public class CodeComp {
  
  /**
   * 返回一个长度和值都是随机的数组,
   * 长度是[0,maxLength-),arr中的每个值[0,maxValue-1]
   * @param maxValue
   * @param maxLength
   * @return
   */
  public static int[] lenRandomValueRandom(int maxValue,int maxLength) {
    int len=(int)(Math.random()*maxLength);
    int[] arr=new int[len];
    for(int i=0;i<len;i++) {
      arr[i]=(int)(Math.random()*maxValue);
    }
    return arr;
  }
  
  
  public static int[] copyArray(int[] src) {
    int length = src.length;
    int[] dst=new int[length];
    for(int i=0;i<length;i++) {
      dst[i]=src[i];
    }
    return dst;
  }
  private static boolean isSorted(int[] arr) {
    int preValue=arr[0];
    for(int i=1;i<arr.length;i++) {
      if(preValue>arr[i]) {
        return false;
      }
      preValue=Math.max(preValue,arr[i]);
    }
    return true;
  }
  /**
   * src和dst长度相同
   * @param src
   * @param dst
   * @return
   */
  public static boolean isEqualsArray(int[] src,int[] dst) {
    int length=src.length;
    for(int i=0;i<length;i++) {
      if(src[i]!=dst[i]) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int maxValue=1000;
    int maxLength=50;
    int testTimes=10000;
    for(int i=0;i<testTimes;i++) {
      int[] arr1;
      do {
        arr1=lenRandomValueRandom(maxValue, maxLength);
      }while(arr1.length<1);
      
      
      int[] arr2 = copyArray(arr1);
      System.out.println(Arrays.toString(arr2));
      //arr1和arr2相等
      //使用选择排序,排arr1
      Code07_SelectSort.selectSort(arr1);
      //使用插入排序,排arr1
      Code04_InsertionSort.insertionSort2(arr2);
      
      System.out.println(Arrays.toString(arr1));
      System.out.println(Arrays.toString(arr2));
      //判断是否有序
      if(!isSorted(arr1)) {
        System.out.println("选择排序错误");
      }
      if(!isSorted(arr2)) {
        System.out.println("插入排序错误");
      }
      //比较是否相同
      if(!isEqualsArray(arr1, arr2)) {
        System.out.println("两次排序结果不同");
      }
      
    }
  }

}
