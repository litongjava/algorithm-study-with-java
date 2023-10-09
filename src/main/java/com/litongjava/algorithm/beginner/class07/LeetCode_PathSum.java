package com.litongjava.algorithm.beginner.class07;

import com.litongjava.model.TreeNode;

public class LeetCode_PathSum {
  public boolean isSum = false;

  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) return false;
    fx(root, 0, targetSum);
    return isSum;
  }

  private void fx(TreeNode x, int preSum, int targetSum) {
    if (x.left == null && x.right == null && preSum + x.val == targetSum) isSum = true;
    preSum += x.val;
    if (x.left != null) fx(x.left, preSum, targetSum);
    if (x.right != null) fx(x.right, preSum, targetSum);
  }
}
