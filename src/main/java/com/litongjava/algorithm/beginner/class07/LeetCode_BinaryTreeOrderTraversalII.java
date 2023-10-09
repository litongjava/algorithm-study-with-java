package com.litongjava.algorithm.beginner.class07;

import com.litongjava.algorithm.beginner.class06.LeetCodeSameTree;
import com.litongjava.model.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_BinaryTreeOrderTraversalII {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> retval = new LinkedList<>();
    if (root == null) return retval;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> curAns = new LinkedList<>();
      for (int i = 0; i < size; i++) {
        TreeNode curNode = queue.poll();
        curAns.add(curNode.val);
        if (curNode.left != null) queue.add(curNode.left);
        if (curNode.right != null) queue.add(curNode.right);
      }
      retval.add(0, curAns);
    }
    return retval;
  }
}
