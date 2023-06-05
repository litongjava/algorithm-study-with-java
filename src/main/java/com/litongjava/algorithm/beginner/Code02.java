package com.litongjava.algorithm.beginner;
/**
 * @author Ping E Lee
 *
 * 计算一个数的阶乘
 */

public class Code02 {

  public static void main(String[] args) {
    System.out.println(jiecheng(10));
  }

  private static int jiecheng(int number) {
    int sum=0;
    int current=1;
    for(int i=1;i<=number;i++) {
      current=current*i;
      sum=+current;
    }
    return sum;
  }
}
