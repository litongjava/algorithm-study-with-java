package com.litongjava.algorithm.beginner.class06;

import com.litongjava.algorithm.beginner.model.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class Demo01 {

  public static void main(String[] args) {
    Student s1 = new Student(1, "001", 10);
    Student s2 = new Student(3, "003", 30);
    Student s3 = new Student(5, "005", 50);
    Student s4 = new Student(2, "002", 20);
    Student s5 = new Student(4, "004", 40);
//    Student[] students = {s1, s2, s3, s4, s5};
//    System.out.println(Arrays.toString(students));
//    Arrays.sort(students, new IdComparator());
//    System.out.println(Arrays.toString(students));
    ArrayList<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);
//    students.sort(new IdComparator());
    students.sort((o1, o2) -> {
      return o1.getAge() > o2.getAge() ? -1 : 1;
    });
    System.out.println(students);
  }
}
