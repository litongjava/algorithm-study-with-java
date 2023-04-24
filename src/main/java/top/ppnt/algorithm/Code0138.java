package top.ppnt.algorithm;

import java.util.HashMap;
import java.util.TreeMap;

import org.w3c.dom.Node;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Ping E Lee
 * 1.3.8.哈希表和有序表的使用
 */

@Slf4j
public class Code0138 {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("zhangsan", "张三");

    log.info("containsKey:{}", map.containsKey("zhangsan"));
    log.info("containsKey:{}", map.containsKey("zhang"));
    log.info("zhangsan:{}", map.get("zhangsan"));

    map.put("zhangsan", "李四");
    log.info("zhangsan:{}", map.get("zhangsan"));

    // map.remove("zhangsan");
    // log.info("zhangsan:{}",map.get("zhangsan"));
    // 默认是key按值传递
    String key = "zhangsan";
    log.info("zhangsan:{}", map.get(key));

    HashMap<Integer, String> map2 = new HashMap<>();
    map2.put(1234567, "I'am 1234567");
    Integer a = 1234567;
    Integer b = 1234567;
    // 比较a和b的内存地址,-->false
    log.info("a==b:{}", a == b);
    // 比较a和b的值,-->true
    log.info("a.equals(b):{}", a.equals(b));

    log.info("a:{}", map2.containsKey(a));
    log.info("b:{}", map2.containsKey(b));

    // 应用数据类型按地址传递
    SimpleNode sn1 = new SimpleNode(1);
    SimpleNode sn2 = new SimpleNode(1);

    HashMap<SimpleNode, String> map3 = new HashMap<>();
    map3.put(sn1, "node value is 1");

    log.info("sn1:{}", map3.containsKey(sn1));
    log.info("sn2:{}", map3.containsKey(sn2));

    HashMap<String, String> map4 = new HashMap<>();
    map4.put("金庸", "倚天屠龙记");

    HashMap<SimpleNodeString, SimpleNodeString> map5 = new HashMap<>();
    SimpleNodeString sns1 = new SimpleNodeString("金庸");
    SimpleNodeString sns2 = new SimpleNodeString("倚天屠龙记");
    map5.put(sns1,sns2);

    TreeMap<Integer, String> treeMap1 = new TreeMap<>();
    treeMap1.put(1, "I'm 1");
    treeMap1.put(2, "I'm 2");
    treeMap1.put(3, "I'm 3");

    log.info("1:{}", treeMap1.containsKey(1));
    log.info("4:{}", treeMap1.containsKey(4));

    // treeMap比哈希表强大的地方
    log.info("{}", treeMap1.firstKey());
    log.info("{}", treeMap1.lastKey());
    
    //<=2最近的key
    log.info("{}",treeMap1.floorKey(2));
    
    //<=的key
    log.info("{}",treeMap1.floorKey(6));
    //>=的key
    log.info("{}",treeMap1.ceilingKey(0));
    log.info("{}",treeMap1.ceilingKey(4));
  }
}
