package com.bridgelabzd17;

public class StackMain {
	/**
	 *  This is the main method which makes use of push method to push the elements to stack and show method to display the data
	 */
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		
		stack.show();

	}

}
