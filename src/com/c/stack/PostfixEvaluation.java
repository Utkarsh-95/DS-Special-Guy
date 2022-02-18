package com.c.stack;

import java.util.Stack;

public class PostfixEvaluation {

	public static void main(String[] args) {
//		String exp = "82/";
		String exp = "138×+";
		int res = evaluateExp(exp);
		System.out.println(res);
	}

	private static int evaluateExp(String exp) {

		Stack<Integer> stack = new Stack<>();

		for (char c : exp.toCharArray()) {
			if (Character.isDigit(c)) {
				stack.push(c - '0');
			} else {
				int x = stack.pop();
				int y = stack.pop();

				if (c == '+') {
					stack.push(y + x);
				} else if (c == '-') {
					stack.push(y - x);
				} else if (c == '/') {
					stack.push(y / x);
				} else if (c == '×') {
					stack.push(y * x);
				}
			}
		}

		return stack.pop();
	}

}
