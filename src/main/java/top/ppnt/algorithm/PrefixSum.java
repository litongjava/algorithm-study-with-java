package top.ppnt.algorithm;

/**
 * @author Ping E Lee
 *
 */
public class PrefixSum {

  private int[] prefixSum;

  public PrefixSum(int[] src) {
    int n = src.length;
    prefixSum = new int[n];
    prefixSum[0] = src[0];
    for (int i = 1; i < n; i++) {
      prefixSum[i] = prefixSum[i - 1] + src[i];
    }
  }

  public int sum(int l, int r) {
    return r == 0 ? prefixSum[r] : prefixSum[r] - prefixSum[l - 1];
  }

}
