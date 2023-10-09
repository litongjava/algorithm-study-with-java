package com.litongjava.algorithm.beginner.class06;

import com.litongjava.model.TreeNode;

import java.util.HashMap;

public class LeetCodeConstructBinaryTreeFromPreorderAndInOrderTraversal {
  static class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      if (preorder == null || inorder == null || preorder.length != inorder.length) {
        return null;
      }
      //build table
      HashMap<Integer, Integer> valueIndexMap = new HashMap<>();
      for (int i = 0; i < inorder.length; i++) {
        valueIndexMap.put(inorder[i], i);
      }
      return fx(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, valueIndexMap);
    }

    private TreeNode fx(int[] preorder, int l1, int r1, int[] inorder, int l2, int r2, HashMap<Integer, Integer> valueIndexMap) {
      if (l1 > r1) return null;
      TreeNode head = new TreeNode(preorder[l1]);
      if (l1 == r1) return head;
      int find = valueIndexMap.get(preorder[l1]);
      head.left = fx(preorder, l1 + 1, l1 + find - l2, inorder, l2, find - 1, valueIndexMap);
      head.right = fx(preorder, l1 + 1 + find - l2, r1, inorder, find + 1, r2, valueIndexMap);
      return head;
    }
  }

  public static void main(String[] args) {
    int[] preorder={3,9,20,15,7};
    int[] inorder={9,3,15,20,7};
    TreeNode treeNode =new Solution().buildTree(preorder, inorder);
    System.out.println(treeNode);
  }
}
