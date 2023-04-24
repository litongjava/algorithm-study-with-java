package top.ppnt.algorithm;

/**
 * @author Ping E Lee
 *
 */
public class CodeRandomNotEqualsProbability {
  public static void main(String[] args) {
    testG();
  }
  
  private static void testG() {
    int totalCount = 1000000;
    int[] counts = new int[2];
    for (int i = 0; i < totalCount; i++) {
      counts[g()]++;
    }
    for (int i = 0; i < 2; i++) {
      System.out.println(i + ":" + (double) counts[i] / (double) totalCount);
    }
  }

  public static int g() {
    int result=0;
    do {
      result=f();
    }while(result==f());
    return result;
  }

  public static void testF() {
    int totalCount = 1000000;
    int[] counts = new int[2];
    for (int i = 0; i < totalCount; i++) {
      counts[f()]++;
    }
    for (int i = 0; i < 2; i++) {
      System.out.println(i + ":" + (double) counts[i] / (double) totalCount);
    }
  }

  /**
   * x 已固定概率返回0和1
   * @return
   */
  public static int f() {
    return Math.random() > 0.84 ? 1 : 0;
  }
}
