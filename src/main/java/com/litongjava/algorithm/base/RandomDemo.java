package com.litongjava.algorithm.base;

public class RandomDemo {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      int r = (int) (Math.random() * i) + 2;
      if (i != r) {
        System.out.println(i);
      }

    }
  }
}
