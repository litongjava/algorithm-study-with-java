package top.ppnt.algorithm;

import java.util.Arrays;

import org.junit.Test;

import com.litongjava.algorithm.beginner.AlgorithmUtils;

/**
 * @author Ping E Lee
 *
 */
public class AlgorithmUtilsTest {

  @Test
  public void randomArrayNotEqTest() {
    for (int i = 0; i < 10000; i++) {
      int[] randomArrayNotEq = AlgorithmUtils.randomArrayNotEq(10, 10);
      if (AlgorithmUtils.isNerghborEq(randomArrayNotEq)) {
        System.out.println(Arrays.toString(randomArrayNotEq));
      }
    }
  }

}
