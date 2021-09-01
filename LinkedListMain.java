package com.bridgelabzd17;

public class LinkedListMain {

	/**
	 *  This is the main method which makes use of insert and show method
	 */
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<>();
		
		list.insert(70);
		list.insertAtStart(30);
		list.insertAtStart(56);
		
		list.show();
		
	}

}
