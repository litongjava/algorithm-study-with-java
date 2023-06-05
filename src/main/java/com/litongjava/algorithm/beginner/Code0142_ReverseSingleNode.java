package com.litongjava.algorithm.beginner;
/**
 * @author Ping E Lee
 * 单链表反转
 */

import com.litongjava.basic.SingleNode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Code0142_ReverseSingleNode {

  /**
   * 单链表反转
   * @param head
   * @return
   */
  public static SingleNode reverseLinkedList(SingleNode head) {
    SingleNode pre = null;
    SingleNode next = null;
    // a-->b-->c-->d
    // a-->null
    // pre-->a
    // head-->b
    while (head != null) {
      next = head.next;
      head.next = pre;
      pre = head;
      head = next;
    }
    return pre;
  }

  private static void test() {
    SingleNode n1 = new SingleNode(1);
    n1.next = new SingleNode(2);
    n1.next.next = new SingleNode(3);

    // n1=reverseLinkedList(n1);
    reverseLinkedList(n1);

    /**
     * toString前 n1:top.ppnt.basic.SingleNode@64c64813
     * toString后 SingleNode(value=3, next=SingleNode(value=2,next=SingleNode(value=1, next=null)))
     */
    log.info("n1:{}", n1);
  }

  private static void test2() {
    SingleNode n1 = new SingleNode(1);
    chageNodeValue(n1);
    log.info("n1:{}", n1);
  }

  private static void chageNodeValue(SingleNode n1) {
    n1.value = 2;
  }

  public static void main(String[] args) {
    test();
    // test2();
  }

}
