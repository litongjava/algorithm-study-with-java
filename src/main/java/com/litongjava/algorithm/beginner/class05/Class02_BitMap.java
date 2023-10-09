package com.litongjava.algorithm.beginner.class05;

import java.util.HashSet;

/**
 * @author Ping E Lee
 */
public class Class02_BitMap {

  /**
   * 实现位图
   *
   * @author Ping E Lee
   */
  public static class BitMap {
    private long[] bits;

    public BitMap(int max) {
      // max + 64) >> 6=(max+64)/64
      bits = new long[(max + 64) >> 6];
    }

    public void add(int num) {
      // num>>6=num/64 找到数组的下标
      // num%64=num & 63 取出低7位数,取模之后,取出后7位,63是01111111
      // 1L是64位二值数,左移的指定位置,和原来的二进制进行或运算,将1替换为0,
      bits[num >> 6] |= (1L << (num & 63));
    }

    public void delete(int num) {
      bits[num >> 6] &= ~(1L << (num & 63));
    }

    public boolean contains(int num) {
      return (bits[num >> 6] & (1L << (num & 63))) != 0;
    }
  }

  public static void main(String[] args) {
    // test1();
    test2();
  }

  private static void test2() {
    int max = 10000;
    BitMap bitMap = new BitMap(max);
    HashSet<Integer> set = new HashSet<>();
    int testTimes = 100000000;
    for (int i = 0; i < testTimes; i++) {
      int num = (int) (Math.random() * (max + 1));
      double decide = Math.random();
      if (decide < 0.333) {
        bitMap.add(num);
        set.add(num);
      } else if (decide < 0.666) {
        bitMap.delete(num);
        set.remove(num);
      } else {
        if (bitMap.contains(num) != set.contains(num)) {
          System.out.println("Oops");
          break;
        }
      }
    }
    for (int num = 0; num <= max; num++) {
      if (bitMap.contains(num) != set.contains(num)) {
        System.out.println("Oops");
      }
    }

  }

  private static void test1() {
    // 测试或运算
    int a = 8 | 4;
    System.out.println(a);
    int b = 8;
    int c = b |= 4;
    System.out.println(c);
    int d = 8;
    d += 4;
  }
}
