package com.geekster;

public class convertshortarrtoBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(0, nums.length - 1, nums);
    }
    
    public TreeNode helper(int lo, int hi, int[] nums){
        if(lo > hi){
            return null;
        }
        
        int mid = (lo + hi)/2;
        
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = helper(lo, mid - 1, nums);
        node.right = helper(mid + 1, hi, nums);
        
        return node;
    }
}

    
    
    