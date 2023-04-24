package top.ppnt.basic;

import lombok.ToString;

/**
 * @author Ping E Lee
 * 单链表结构
 */
@ToString
public class SingleNode {
  public int value;
  public SingleNode next;
  
  public SingleNode(int data) {
    this.value=data;
  }
}
