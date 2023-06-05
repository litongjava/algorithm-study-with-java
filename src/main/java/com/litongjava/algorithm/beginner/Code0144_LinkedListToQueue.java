package com.litongjava.algorithm.beginner;

/**
 * @author Ping E Lee
 *
 */
public class Code0144_LinkedListToQueue {
  public static class Node<V> {
    public V value;
    public Node<V> next;

    public Node(V v) {
      value = v;
      next = null;
    }
  }

  /**
   * 使用单链表实现队列 
   * @param <V>
   */
  public static class MyQueue<V> {
    private Node<V> head;
    private Node<V> tail;
    private int size;

    public MyQueue() {
      head = null;
      tail = null;
      size = 0;
    }

    public boolean isEmpty() {
      return size == 0;
    }

    public int size() {
      return size;
    }

    /**
     * 压入
     * @param value
     */
    public void offer(V value) {
      Node<V> cur = new Node<>(value);
      if (tail == null) {
        head = cur;
        tail = cur;
      } else {
        tail.next = cur;
        tail = cur;
      }
      size++;
    }

    /**
     * 弹出
     * JVM会自动回收数据,如果是C/C++需要使用析构函数
     * @return
     */
    public V poll() {
      V ans = null;
      if (head != null) {
        ans = head.value;
        head = head.next;
        size--;
      }
      if (head == null) {
        tail = null;
      }
      return ans;
    }

    /**
     * 看一下要弹出的节点是什么,但是不真的弹出
     * JVM会自动回收数据,如果是C/C++需要使用析构函数
     */
    public V peek() {
      V ans = null;
      if (head != null) {
        ans = head.value;
      }
      return ans;
    }
  }
}
