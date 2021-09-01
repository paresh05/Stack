package com.bridgelabzd17;

public class LinkedList<K>
{
	Node<K> head;
	
	/**
	 * This method is used to insert the data
	 * @param data This is the value of the data
	 */
	public void insert(K data)
	{
		Node<K> node =new Node<>(data);
		node.data = data;
		node.next = null;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node<K> n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	
	
	/**
	 * This method is used to insert the data at the start
	 */
	public void insertAtStart(K data)
	{
		Node<K> node =new Node<>(data);
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	
	/**
	 * This method is used to display the data
	 */
	public void show()
	{
		Node<K> n = head;
		
		while(n.next!=null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
