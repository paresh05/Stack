package com.bridgelabzd17;

/**
 * This class is used to initialize and declare the variables data and next 
 * @param data This is the value of the data 
 */
public class Node <K> 
{
	K data;
	Node<K> next;
	
	public Node(K data)
	{
		this.data=data;
		this.next=null;
	}
}
