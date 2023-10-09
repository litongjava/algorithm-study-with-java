package com.litongjava.algorithm.base;


public class XorDemo {
  public static void main(String[] args) {
//    test01();
    test02();

  }

  private static void test02() {
    int a = 10;
    System.out.println(a & (-a));
  }

  private static void test01() {
    int a = 10;
    int b = 11;
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    System.out.println(a);
    System.out.println(b);
  }
}
