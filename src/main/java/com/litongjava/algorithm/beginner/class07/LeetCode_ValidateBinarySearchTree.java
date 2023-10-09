package com.litongjava.algorithm.beginner.class07;

import com.litongjava.model.TreeNode;

public class LeetCode_ValidateBinarySearchTree {
  class Info {
    public boolean isBST;
    public int max;
    public int min;

    public Info(boolean b, int max, int min) {
      this.isBST = b;
      this.max = max;
      this.min = min;
    }
  }

  public boolean isValidBST(TreeNode root) {
    Info info = fx(root);
    return info.isBST;
  }

  private Info fx2(TreeNode x) {
    if (x == null) return null;

    Info leftInfo = fx2(x.left);
    Info rightInfo = fx2(x.right);

    int max = x.val;
    int min = x.val;

    if (leftInfo != null) {
      max = Math.max(leftInfo.max, max);
      min = Math.min(leftInfo.min, min);
    }

    if (rightInfo != null) {
      max = Math.max(rightInfo.max, max);
      min = Math.min(rightInfo.min, min);
    }
    boolean isBST = true;
    if (leftInfo != null && !leftInfo.isBST) isBST = false;
    if (rightInfo != null && !rightInfo.isBST) isBST = false;

    boolean leftMaxLessThanX = leftInfo == null ? true : (leftInfo.max < x.val);
    boolean rightMinGreaterThatX = rightInfo == null ? true : (rightInfo.min > x.val);

    if (!leftMaxLessThanX || !rightMinGreaterThatX) isBST = false;

    return new Info(isBST, max, min);
  }

  private Info fx(TreeNode x) {
    if (x == null) return null;

    Info leftInfo = fx(x.left);
    Info rightInfo = fx(x.right);

    int max = x.val;
    int min = x.val;

    if (leftInfo != null) {
      max = Math.max(leftInfo.max, max);
      min = Math.min(leftInfo.min, min);
    }

    if (rightInfo != null) {
      max = Math.max(rightInfo.max, max);
      min = Math.min(rightInfo.min, min);
    }
    boolean isBST = true;
    if (leftInfo != null && !leftInfo.isBST) isBST = false;
    if (rightInfo != null && !rightInfo.isBST) isBST = false;

    boolean leftMaxLessThanX = true;
    if (leftInfo != null) leftMaxLessThanX = leftInfo.max < x.val;
    boolean rightMinGreaterThatX = true;
    if (rightInfo != null) rightMinGreaterThatX = rightInfo.min > x.val;

    if (!leftMaxLessThanX || !rightMinGreaterThatX) isBST = false;

    return new Info(isBST, max, min);
  }
}
