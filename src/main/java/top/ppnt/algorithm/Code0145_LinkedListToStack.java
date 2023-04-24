package top.ppnt.algorithm;

/**
 * @author Ping E Lee
 *
 */
public class Code0145_LinkedListToStack {
  /**
   * 单链表结构
   * @author Ping E Lee
   *
   * @param <V>
   */
  public static class Node<V> {
    public V value;
    public Node<V> next;

    public Node(V v) {
      value = v;
      next = null;
    }
  }

  /**
   * 用单链表实现栈
   * @author Ping E Lee
   *
   * @param <V>
   */
  public static class MyStack<V> {
    private Node<V> head;
    private int size;

    public MyStack() {
      head = null;
      size = 0;
    }

    public boolean isEmpty() {
      return size == 0;
    }

    public int size() {
      return size;
    }

    public void push(V value) {
      Node<V> cur = new Node<>(value);
      if (head == null) {
        head = cur;
      } else {
        cur.next = head;
        head = cur;
      }
      size++;
    }

    public V pop() {
      V ans = null;
      if (head != null) {
        ans = head.value;
        head = head.next;
        size--;
      }
      return ans;
    }

    public V peek() {
      return head != null ? head.value : null;
    }
  }

}
