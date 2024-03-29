package com.litongjava.algorithm.beginner.class06;

import com.litongjava.model.TreeNode;

public class LeetCodeSameTree {

  class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if (p == null ^ q == null) {
        return false;
      }
      if (p == null && q == null) {
        return true;
      }
      return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
  }
}

