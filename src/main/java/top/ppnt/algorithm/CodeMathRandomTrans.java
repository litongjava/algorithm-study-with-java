package top.ppnt.algorithm;

/**
 * @author Ping E Lee
 *
 */
public class CodeMathRandomTrans {
  public static void main(String[] args) {
    testh2();
  }

  private static void testG() {
    int count = 0;
    int totalCount = 10000;
    for (int i = 0; i < totalCount; i++) {
      int g = h2();
      if (g == 0) {
        count++;
      }
    }
    System.out.println((double) count / (double) totalCount);
  }

  // 从1-7等概率返回一个
  private static void testh2() {
    int totalCount = 10000;
    int[] counts = new int[8];
    for (int i = 0; i < totalCount; i++) {
      int g = h2() + 1;
      counts[g]++;
    }
    for (int i = 0; i < 7; i++) {
      int index = i + 1;
      System.out.println(index + ":" + (double) counts[index] / (double) totalCount);
    }

  }

  // 从0-6等概率返回一个
  public static int h2() {
    int ans = 0;
    do {
      ans = (g() << 2) + (g() << 1) + (g() << 0);
    } while (ans == 7);
    return ans;
  }

  public static int h() {
    int ans = (g() << 2) + (g() << 1) + (g() << 0);
    return ans;
  }

  /**
   * 假设一个函数,返回1-5直接的随机的数,如何使用这个函数,返回1-7之间的随机数,
  将f函数改造成0-1发生器
   */
  public static int g() {
    int ans = 0;
    do {
      ans = f();
    } while (ans == 3);
    return ans < 3 ? 0 : 1;
  }

  public static int f() {
    return (int) (Math.random() * 5) + 1;
  }
}
