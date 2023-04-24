package top.ppnt.algorithm;

/**
 * @author Ping E Lee
 *
 */
public class Code0146_DoubleLinkedListToDeQue {

  /**
   * 双链表
   * @author Ping E Lee
   *
   * @param <V>
   */
  public static class Node<V> {
    public V value;
    public Node<V> last;
    public Node<V> next;

    public Node(V v) {
      value = v;
      last = null;
      next = null;
    }
  }

  public static class MyDeque<V> {
    private Node<V> head;
    private Node<V> tail;
    private int size;

    public MyDeque() {
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

    public void pushHead(V value) {
      Node<V> cur = new Node<>(value);
      if (head == null) {
        head = cur;
        tail = cur;
      } else {
        cur.next = head;
        head.last = cur;
        head = cur;
      }
      size++;
    }

    public void pushTail(V value) {
      Node<V> cur = new Node<>(value);
      if (head == null) {
        head = cur;
        tail = cur;
      } else {
        tail.next = cur;
        cur.last = tail;
        tail = cur;
      }
      size++;
    }

    public V pushHead() {
      V ans = null;
      if (head == null) {
        return ans;
      }
      size--;
      ans = head.value;
      if (head == tail) {
        head = null;
        tail = null;
      }
      return ans;
    }

    public V pushTail() {
      V ans = null;
      if (head == null) {
        return ans;
      }
      size--;
      if (head == tail) {
        head = null;
        tail = null;
      } else {
        tail = tail.next;
        tail.next = null;
      }
      return ans;
    }
  }

}
