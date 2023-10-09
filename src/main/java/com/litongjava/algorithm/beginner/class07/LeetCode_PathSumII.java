package com.litongjava.algorithm.beginner.class07;

import com.litongjava.model.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_PathSumII {
  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>> retval = new ArrayList<>();
    if (root == null) {
      return retval;
    }
    fx(root, new ArrayList<>(), 0, retval, targetSum);
    return retval;
  }

  private void fx(TreeNode x, ArrayList<Integer> values, int preSum, List<List<Integer>> retval, int targetSum) {
    values.add(x.val);
    if (x.left == null && x.right == null && preSum + x.val == targetSum) {
      retval.add(new ArrayList<>(values));
    }
    preSum += x.val;
    if (x.left != null) {
      fx(x.left, values, preSum, retval, targetSum);
    }
    if (x.right != null) {
      fx(x.right, values, preSum, retval, targetSum);
    }
    values.remove(values.size() - 1);
  }
}
