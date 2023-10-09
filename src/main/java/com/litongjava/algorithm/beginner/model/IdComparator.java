package com.litongjava.algorithm.beginner.model;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
  // 返回负数,第一个参数排前面
  // 返回正数,第二个参数排签名
  // 返回0,无所谓
  @Override
  public int compare(Student o1, Student o2) {
    return o1.getId() < o2.getId() ? -1 : 1;
  }
}