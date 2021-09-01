package com.bridgelabzd17;

public class Stack<K> {
	
	LinkedList<K> list = new LinkedList<>();

	/**
	 * This method is used to push the data using the insertAtStart method of the linked list
	 * 
	 * @param data This is the value of the data
	 */
	
	public void push(K data)
	{
		list.insertAtStart(data);
	}
	
	/**
	 * This method is used to fetch the data of the last element inserted
	 */
	public void peek()
	{
		System.out.println(list.peak());
	}

	/**
	 * This method is used to remove the element from the stack
	 */
	public void pop()
	{
		list.popAllElements();
	}
	
	/**
	 * This method is used to display the data using the show method of linked ist
	 */
	public void show()
	{
		list.show();
	}
}
