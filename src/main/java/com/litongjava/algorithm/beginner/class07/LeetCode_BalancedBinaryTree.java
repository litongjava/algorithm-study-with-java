package com.litongjava.algorithm.beginner.class07;

import com.litongjava.model.TreeNode;


public class LeetCode_BalancedBinaryTree {
  class Info {
    public boolean isBalanced;
    public int height;

    public Info(Boolean b, int h) {
      this.isBalanced = b;
      this.height = h;
    }
  }

  public boolean isBalanced(TreeNode root) {
    return process(root).isBalanced;
  }

  private Info process(TreeNode x) {
    if (x == null) return new Info(true, 0);
    Info leftInfo = process(x.left);
    Info rightInfo = process(x.right);

    int height = Math.max(leftInfo.height, rightInfo.height) + 1;
    boolean isBalanced = leftInfo.isBalanced
      && rightInfo.isBalanced && Math.abs(leftInfo.height - rightInfo.height) < 2;
    return new Info(isBalanced, height);
  }
}
