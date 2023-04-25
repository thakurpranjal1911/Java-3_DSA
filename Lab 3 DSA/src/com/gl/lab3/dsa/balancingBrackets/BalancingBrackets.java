package com.gl.lab3.dsa.balancingBrackets;

import java.util.Stack;

public class BalancingBrackets {

	public boolean checkBalance(String bracketExp) {

		Stack<Character> stack = new Stack<>();
		char[] chars = bracketExp.toCharArray();

		for (char c : chars) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			switch(c) {
			case ')':
				if(stack.pop() != '(') {
					return false;
				}
				break;
			case ']':
				if(stack.pop() != '[') {
					return false;
				}
				break;
			case '}':
				if(stack.pop() != '{') {
					return false;
				}
				break;
			}
		}
		return (stack.isEmpty());
	}

}
