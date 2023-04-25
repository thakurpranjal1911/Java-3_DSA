package com.gl.lab3.dsa.findSumInBST;

import java.util.HashSet;
import java.util.Set;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(20);
		root.insertData(30, root);
		root.insertData(40, root);
		root.insertData(50, root);
		root.insertData(60, root);
		root.insertData(70, root);
		root.insertData(80, root);
		
		SumPairInBST obj = new SumPairInBST();
		
		int sum=150;
		Set<Integer> data = new HashSet<Integer>();
		if(!(obj.findSumPair(root, sum, data))) {
			System.out.println("Cannot find the pair");
		}

	}

}

