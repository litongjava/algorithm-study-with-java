package top.ppnt.basic;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Ping E Lee
 * java的基本数据类型是按值传递,java的引用数据类型是按地址传递
 */
@Slf4j
public class CodeDelivery {

  public static void main(String[] args) {
    int a=10;
    chageBasicTypeValue(a);
    log.info("a:{}",a);
    List<Integer> list=new ArrayList<>();
    list.add(10);
    chageReferenceTypeValue(list);
    log.info("list:{}",list);
    
    String str="I'am Ping";
    chageStringValue(str);
    log.info("str:{}",str);
  }

  /**
   * 默认情况下,String是按值传递
   * @param str
   */
  private static void chageStringValue(String str) {
    str="I'am not Ping";
  }

  private static void chageReferenceTypeValue(List<Integer> list) {
    list.add(100);
  }

  private static void chageBasicTypeValue(int a) {
    a=100;
  }
}
