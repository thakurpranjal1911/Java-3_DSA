package com.gl.lab3.dsa.findSumInBST;

import java.util.Set;

public class SumPairInBST {
	
	public boolean findSumPair(TreeNode root, int sum, Set<Integer> data) {
		
		if(root == null) {
			return false;
		}
		
		if(findSumPair(root.left, sum, data)) {
			return true;
		}
		
		int remainder = sum-root.data;
		if(data.contains(remainder)) {
			System.out.println("The pair is:"+root.data+", "+remainder);
			return true;
		}else {
			data.add(root.data);
		}
		
		return findSumPair(root.right, sum, data);
		
	}

}
