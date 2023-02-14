package com.runtimeturtle.leetcode;

/**
 * Definition for a binary tree node.
 * @author pandeys3
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class Program2235 {

	public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val)? true:false;
    }
	
}
