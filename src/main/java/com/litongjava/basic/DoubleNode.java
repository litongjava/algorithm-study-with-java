package com.litongjava.basic;

import lombok.ToString;

/**
 * @author Ping E Lee
 * 双链表结构
 */
@ToString
public class DoubleNode {
  public int value;
  public DoubleNode last;
  public DoubleNode next;

  public DoubleNode(int data) {
    this.value = data;
  }
}
