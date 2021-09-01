package com.bridgelabzd17;

public class LinkedListMain {

	/**
	 *  This is the main method which makes use of insert and show method
	 */
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<>();
		
		list.insert(70);
		list.insert(56);
		list.insertAtBetween(1,30);
		
		list.show();
		
	}

}
