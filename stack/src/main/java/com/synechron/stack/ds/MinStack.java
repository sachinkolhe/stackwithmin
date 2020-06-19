package com.synechron.stack.ds;

public class MinStack {

	private Node top;
	
	public MinStack(){
		this.top = null;
	}
	public void push(int value){
		if(top == null){
			top = new Node(value);
			return;
		}
		Node temp = new Node(value);
		temp.next = top;
		temp.min = Math.min(this.top.min, value);
		this.top = temp;
	}
	
	public int getMin(){
		if(isEmpty()){
			throw new RuntimeException("Stack is Empty");
		}
		return this.top.min;
	}
	
	public void pop(){
		if(isEmpty()){
			throw new RuntimeException("Stack is Empty");
		}
		this.top = top.next;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	private static class Node {
		
		private int value;
		private int min;
		private Node next;
		
		public Node(int value) {
			this.value = value;
			this.min = value;
			this.next = null;
		}

			

	}
}
