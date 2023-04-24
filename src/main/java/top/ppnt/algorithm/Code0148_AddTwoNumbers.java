package top.ppnt.algorithm;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ping E Lee
 *
 */
@Slf4j
public class Code0148_AddTwoNumbers {

  // 不要提交这个类
  @ToString
  public static class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
      this.val = val;
    }
  }

  /**
   * 求出链表的长度
   * @param head
   * @return
   */
  public static int listLength(ListNode head) {
    int len = 0;
    while (head != null) {
      len++;
      head = head.next;
    }
    return len;
  }

  public static ListNode addToNumbers(ListNode head1, ListNode head2) {
    int len1 = listLength(head1);
    int len2 = listLength(head2);
    ListNode l = len1 >= len2 ? head1 : head2;
    ListNode s = l == head1 ? head2 : head1;

    ListNode curL = l;
    ListNode curS = s;

    ListNode last = curL;
    int carry = 0;
    int curNum = 0;
    while (curS != null) {
      curNum = curL.val + curS.val + carry;
      curL.val = curNum % 10;
      carry = curNum / 10;
      last = curL;
      curL = curL.next;
      curS = curS.next;
    }
    while (curL != null) {
      curNum = curL.val + carry;
      curL.val = curNum % 10;
      carry = curNum / 10;
      last = curL;
      curL = curL.next;
    }

    if (carry != 0) {
      last.next = new ListNode(1);
    }
    return l;
  }

  public static void main(String[] args) {
    ListNode head1 = new ListNode(4);
    head1.next = new ListNode(3);
    head1.next.next = new ListNode(6);
    head1.next.next.next = new ListNode(7);

    ListNode head2 = new ListNode(2);
    head2.next = new ListNode(5);
    head2.next.next = new ListNode(3);

    ListNode result = addToNumbers(head1, head2);
    log.info("reuslt:{}", printNodeValue(result));
  }

  private static int[] printNodeValue(ListNode node) {
    int length = listLength(node);
    int[] result = new int[length];
    int i = 0;
    while (i < length) {
      result[i] = node.val;
      node = node.next;
      System.out.println(i);
      i++;
    }
    return result;
  }
}
