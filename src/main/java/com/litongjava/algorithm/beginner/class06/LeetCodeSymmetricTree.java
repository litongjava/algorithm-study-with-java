package com.litongjava.algorithm.beginner.class06;

import com.litongjava.model.TreeNode;

public class LeetCodeSymmetricTree {
  class Solution {
    public boolean isSymmetric(TreeNode root) {
      return isMirror(root,root);
    }

    private boolean isMirror(TreeNode a, TreeNode b) {
      if(a==null ^ b==null){
        return false;
      }
      if(a==null && b==null){
        return true;
      }
      return a.val==b.val && isMirror(a.left,b.right) && isMirror(a.right,b.left);
    }
  }
}
