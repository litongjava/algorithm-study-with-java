package com.litongjava.algorithm.beginner.class06;

import com.litongjava.algorithm.beginner.model.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeeCode23MergekSortedLists {
  public class ListNodeComparator implements Comparator<ListNode> {

    @Override
    public int compare(ListNode o1, ListNode o2) {
      return o1.val - o2.val;
    }
  }

  public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null) {
      return null;
    }
    PriorityQueue<ListNode> listNodes = new PriorityQueue<>(new ListNodeComparator());
    for (int i = 0; i < lists.length; i++) {
      if (lists[i] != null) {
        listNodes.add(lists[i]);
      }
    }
    if (listNodes.isEmpty()) {
      return null;
    }

    ListNode head = listNodes.poll();
    ListNode pre = head;
    if (pre.next != null) {
      listNodes.add(pre.next);
    }

    while (!listNodes.isEmpty()) {
      ListNode current = listNodes.poll();
      pre.next = current;
      pre = current;
      if (current.next != null) {
        listNodes.add(current.next);
      }
    }
    return head;
  }
}
