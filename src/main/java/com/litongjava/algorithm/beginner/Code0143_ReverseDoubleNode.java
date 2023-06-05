package com.litongjava.algorithm.beginner;

import java.util.ArrayList;

import com.litongjava.basic.DoubleNode;

/**
 * @author Ping E Lee
 *
 */
public class Code0143_ReverseDoubleNode {
  /**
   * 双链表反转
   * @param head
   * @return
   */
  public static DoubleNode reserseDoubleNode(DoubleNode head) {
    if (head == null) {
      return null;
    }
    ArrayList<DoubleNode> list = new ArrayList<>();
    // 将双链表放入ArrayList
    while (head != null) {
      list.add(head);
      head = head.next;
    }
    // 将第一个链表指向null
    list.get(0).next = null;

    // 进行链表反转
    DoubleNode pre = list.get(0);
    int n = list.size();
    for (int i = 0; i < n; i++) {
      DoubleNode cur = list.get(i);
      cur.last = null;
      cur.next = pre;
      pre.last = cur;
      pre = cur;
    }
    return list.get(n - 1);
  }

  private static void test() {
  }

  public static void main(String[] args) {
    test();
  }
}
