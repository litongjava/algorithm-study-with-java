package top.ppnt.algorithm;

/**
 * @author Ping E Lee
 *
 */
public class CodeMathRandom {
  public static void main(String[] args) {
    double a = 0.8;
    // System.out.println(compute(a));
//    System.out.println(randoom01());
    power2Test();
  }

  private static int randoom01() {
    int k = 9;
    int[] counts = new int[k];
    for (int i = 0; i < 9000000; i++) {
      int result = (int) (Math.random() * k);
      counts[result]++;
    }
    for (int i = 0; i < k; i++) {
      System.out.println(i + "出现的次数:" + counts[i]);
    }
    Math.random();
    return 0;
  }

  private static double compute(double a) {
    int totalCount = 1000000;
    int count = 0;
    for (int i = 0; i < totalCount; i++) {
      if (Math.random() < a) {
        count++;
      }
    }
    return (double) count / (double) totalCount;
  }

  public static void power2Test() {
    int count = 0;
    double x = 0.2;
    int totalCount = 100000;
    for (int i = 0; i < totalCount; i++) {
      if (x2xPower2() < x) {
        count++;
      }
    }
    System.out.println((double) count / (double) totalCount);
    System.out.println(Math.pow(x,2));
  }

  /**
   * 返回[0,1) 范围上的一个小数
   * 任意的x,x属于[0,1),[0,x)范围上的数的出现概率有x调整为x^2
   * @return
   */
  public static double x2xPower2() {
    double min = Math.max(Math.random(), Math.random());
    return min;
  }
  public static double x2xPower3() {
    double min = Math.max(Math.random(),Math.max(Math.random(), Math.random()));
    return min;
  }
}
