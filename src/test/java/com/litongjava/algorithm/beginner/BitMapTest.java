package com.litongjava.algorithm.beginner;

import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.*;

public class BitMapTest {

  @Test
  public void test1() {
    int i = 1024;
    System.out.println(i / 2);
    System.out.println(i >> 1);

    System.out.println(i / 4);
    System.out.println(i >> 2);

    System.out.println(i / 8);
    System.out.println(i >> 3);

    System.out.println(i / 16);
    System.out.println(i >> 4);

    System.out.println(i / 512);
    System.out.println(i >> 9);
  }

  @Test
  public void test2() {
    double x = 512; // 要计算log2 x的值
    double log2x = Math.log(x) / Math.log(2); // 使用换底公式计算log2 x
    System.out.println(log2x);
  }

  @Test
  public void test3() {
    int i = 170;
    System.out.println(170 / 64);
    System.out.println(170 % 64);
    System.out.println(170 >> 6);
    System.out.println(170 & 63);
  }


  @Test
  public void test4() {
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      boolean isEquals = i % 64 == (i & 63);
      if (isEquals == false) {
        System.out.println(i);
      }
      System.out.println(isEquals);
    }
  }

  @Test
  public void test5() {
    int x = 32757;
    for (int i = 2; i < 100; i++) {
      int y1 = 0;
      int pow = (int) Math.pow(2, 2);
      try {
        y1 = x % pow;
      } catch (Exception e) {
        System.out.println(i);
        System.exit(1);
      }

      boolean isEquals = y1 == (x & (pow - 1));
      if (isEquals == false) {
        System.out.println(i);

      }
    }
  }

  @Test
  public void test06() {
    System.out.println(32757 % Math.pow(2, 2));
  }

  @Test
  public void test07() {
    System.out.println(2 ^ 2);
  }

  @Test
  public void test08() {
    System.out.println(2 | 1L);
  }

  @Test
  public void test09() {
    //int num = 4;
    int num = 1 << 2;
    System.out.println(num);
    printBinary(num);
    printBinary(~num);
    printBinary(num & ~num);
  }

  @Test
  public void test10() {
    byte x = 46;
    byte y = 24;
    printBinary(x);
    printBinary(y);
    byte z = (byte) (x + y);
    printBinary(z);

    byte a1 = (byte) (x ^ y);
    byte b1 = (byte) ((x & y) << 1);
    printBinary(a1);
    printBinary(b1);

    byte a2 = (byte) (a1 ^ b1);
    byte b2 = (byte) ((a1 & b1) << 1);
    printBinary(a1);
    printBinary(b2);

    byte a3 = (byte) (a2 ^ b2);
    byte b3 = (byte) ((a2 & b2) << 1);
    printBinary(a3);
    printBinary(b3);

    byte a4 = (byte) (a3 ^ b3);
    byte b4 = (byte) ((a3 & b3) << 1);
    printBinary(a4);
    printBinary(b4);

    System.out.println(a4 == z);
  }


  private static void printBinary(byte num) {
    for (byte i = 7; i >= 0; i--) {
      System.out.print((num & ((byte) 1 << i)) == (byte) 0 ? "0" : "1");
    }
    System.out.println();
  }

  private static void printBinary(int num) {
    for (int i = 31; i >= 0; i--) {
      System.out.print((num & (1 << i)) == 0 ? "0" : "1");
    }
    System.out.println();
  }
}