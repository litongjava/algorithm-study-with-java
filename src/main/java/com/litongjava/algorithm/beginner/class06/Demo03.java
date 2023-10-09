package com.litongjava.algorithm.beginner.class06;

import com.litongjava.algorithm.beginner.model.IdComparator;
import com.litongjava.algorithm.beginner.model.Student;

import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo03 {
  public static void main(String[] args) {
    Student s1 = new Student(1, "001", 10);
    Student s2 = new Student(3, "003", 30);
    Student s3 = new Student(5, "005", 50);
    Student s4 = new Student(2, "002", 20);
    Student s5 = new Student(4, "004", 40);

    PriorityQueue<Student> students = new PriorityQueue<>(new IdComparator());
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);

    System.out.println(students.peek());
    //从小到大弹出所有值
    while (!students.isEmpty()) {
      System.out.println(students.poll());
    }
    TreeSet<Student> students1 = new TreeSet<>(new IdComparator());
    TreeMap<Student, String> stringStudentTreeMap = new TreeMap<>(new IdComparator());
  }
}
