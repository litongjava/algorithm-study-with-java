package com.litongjava.algorithm.beginner.class05;

import org.junit.Test;

import static org.junit.Assert.*;

public class Code03_BitAddMinusMultiDivTest {

  @Test
  public void testAdd() {
    System.out.println(Code03_BitAddMinusMultiDiv.add(1, 0));
    System.out.println(Code03_BitAddMinusMultiDiv.add(10, 1));
    int a = 10;
    for (int b = 0; b < 100; b++) {
      int c = Code03_BitAddMinusMultiDiv.add(a, b);
      if (c != a + b) {
        System.out.println(b);
      }
    }
  }

  @Test
  public void testPow() {
    int a = 10;
    int b = 1;
    int sum = a ^ b;
    a ^= b;
    System.out.println(sum);
    System.out.println(a);
  }

  @Test
  public void testMulti() {
    int a = 10;
    int b = -3;
    System.out.println(Code03_BitAddMinusMultiDiv.multi(10, -3));
  }

  @Test
  public void test01() {
    int a = 0;
    int b = 1;
    int c = a ^ b;
    System.out.println(c);
    System.out.println(true ^ true);
    System.out.println(false ^ false);
    System.out.println(true ^ false);
  }

  @Test
  public void test02() {
    System.out.println(-Integer.MIN_VALUE);
  }

  @Test
  public void testDiv() {
//    System.out.println(Code03_BitAddMinusMultiDiv.div(10, 3));
    System.out.println(Code03_BitAddMinusMultiDiv.divide(-2147483648, 1));
//    System.out.println(Code03_BitAddMinusMultiDiv.div(-2147483648, 1));
  }

  @Test
  public void testMinus(){
//    System.out.println(Code03_BitAddMinusMultiDiv.minus(30, 1));


  }
}