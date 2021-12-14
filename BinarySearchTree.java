package com.geekster;

public class BinarySearchTree {
	
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        int min = Math.min(p.val, q.val);
	        int max = Math.max(p.val, q.val);
	        return lca(root, min, max);
	    }
	    private TreeNode lca(TreeNode root, int min, int max) {
	        if (root.val >= min && root.val <= max) {
	            return root;
	        }
	        if (root.val > max) {
	            return lca(root.left, min, max);
	        }
	        if (root.val < min) {
	            return lca(root.right, min, max);
	        }
	        return null;
	    }
	}

