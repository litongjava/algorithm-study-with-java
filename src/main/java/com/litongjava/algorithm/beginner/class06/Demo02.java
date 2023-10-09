package com.litongjava.algorithm.beginner.class06;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Demo02 {
  public static class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      return o1 > o2 ? -1 : 1;
    }
  }

  public static void main(String[] args) {
    PriorityQueue<Integer> integers = new PriorityQueue<>(new MyComparator());
    integers.add(2);
    integers.add(4);
    integers.add(6);
    integers.add(8);
    integers.add(10);
    integers.add(1);
    integers.add(3);
    integers.add(5);
    integers.add(7);
    integers.add(9);
    //获取最小值
    System.out.println(integers.peek());
    integers.add(0);
    System.out.println(integers.peek());
    //从小到大弹出所有值
    while (!integers.isEmpty()) {
      System.out.println(integers.poll());
    }
  }
}
