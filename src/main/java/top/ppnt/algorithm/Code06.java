package top.ppnt.algorithm;

/**
 * @author Ping E Lee
 *
 */
public class Code06 {
  public static void main(String[] args) {

    // int 32位
    int num = 83928328;
//    printBinary(num);
//    printMaxInteger();
//    printBinary(Integer.MAX_VALUE);
//    printBinary(Integer.MIN_VALUE);
    printBinary(-5);
    
    int a=5;
    System.out.println(-a);
    System.out.println((~a+1));
  }

  private static void printBinary(int num) {
    /**
     * 打印32位数
     */
    for (int i = 31; i >= 0; i--) {
      System.out.print((num & (1 << i)) == 0 ? "0" : "1");
    }
    System.out.println();
  }
  
  public static void printMaxInteger() {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
  }
}