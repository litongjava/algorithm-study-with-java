package com.litongjava.algorithm.beginner.class06;

import com.litongjava.model.TreeNode;

public class LeetCodeMaximumDepthOfBinaryTree {
  class Solution {
    public int maxDepth(TreeNode root) {
      if (root == null) {
        return 0;
      }
      return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
  }
}
